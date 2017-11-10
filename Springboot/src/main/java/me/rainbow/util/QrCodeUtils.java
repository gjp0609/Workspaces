package me.rainbow.util;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 二维码生成、识别工具
 * 可通过修改参数配置生成大小及格式
 *
 * @author guojinpeng
 * @date 17.11.9 10:54
 */
public class QrCodeUtils {

    private static String encodeType = "UTF-8";
    private static int width = 200;
    private static int height = 200;
    private static int minSize = -1;

    /**
     * 生成二维码到指定文件
     *
     * @param content    二维码内容
     * @param targetFile 输出路径
     * @return 成功或失败
     */
    public static boolean encode(String content, File targetFile) {
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, encodeType);
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().
                    encode(content, BarcodeFormat.QR_CODE, 0, 0, hints);
            if (bitMatrix != null) {
                BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
                System.out.println(image.getHeight());
                BufferedImage zoomImage;
                if (minSize != -1) {
                    int k;
                    int i = 1;
                    do {
                        k = bitMatrix.getHeight() * i++;
                    } while (k < minSize);
                    zoomImage = ImageUtils.zoomImage(image, k, k);
                    minSize = 0;
                } else
                    zoomImage = ImageUtils.zoomImage(image, width, height);
                Result decode = decode(zoomImage);
                if (decode == null) {
                    minSize = width > height ? width : height;
                    encode(content, targetFile);
                } else ImageIO.write(zoomImage, "png", targetFile);
            } else return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static BufferedImage encode(String content) {
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, encodeType);
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix;
        BufferedImage zoomImage = null;
        try {
            bitMatrix = new MultiFormatWriter().
                    encode(content, BarcodeFormat.QR_CODE, 0, 0, hints);
            if (bitMatrix != null) {
                BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
                System.out.println(image.getHeight());
                if (minSize != -1) {
                    int k;
                    int i = 1;
                    do {
                        k = bitMatrix.getHeight() * i++;
                    } while (k < minSize);
                    zoomImage = ImageUtils.zoomImage(image, k, k);
                    minSize = 0;
                } else
                    zoomImage = ImageUtils.zoomImage(image, width, height);
                Result decode = decode(zoomImage);
                if (decode == null) {
                    minSize = width > height ? width : height;
                    zoomImage = encode(content);
                }
            }
        } catch (Exception e) {
            return null;
        }
        return zoomImage;
    }

    /**
     * 识别图片中的二维码
     *
     * @param file 要识别的图片
     * @return 二维码信息，若识别失败则返回null
     */
    public static String decode(File file) {
        BufferedImage image;
        Result result = null;
        try {
            image = ImageIO.read(file);
            result = decode(image);
        } catch (Exception ignored) {
        }
        return result != null ? result.getText() : null;
    }

    private static Result decode(BufferedImage image) {
        Result result = null;
        try {
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            Binarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
            Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
            hints.put(DecodeHintType.CHARACTER_SET, encodeType);
            result = new MultiFormatReader().decode(binaryBitmap, hints);
        } catch (Exception ignored) {
        }
        return result;
    }

    public static void setSize(int width, int height) {
        if (width <= 0) width = 1;
        if (height <= 0) height = 1;
        QrCodeUtils.width = width;
        QrCodeUtils.height = height;
    }

    public static void setMinSize(int minSize) {
        QrCodeUtils.minSize = minSize;
    }
}
