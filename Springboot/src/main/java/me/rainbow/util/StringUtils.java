package me.rainbow.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.UUID;

/**
 * @author guojinpeng
 * @date 17.8.22 18:27
 */
public class StringUtils {

    /**
     * 产生指定位数随机字符串
     *
     * @param length 长度
     * @param type   字符串类型<br>
     *               &emsp;&emsp;1 纯字母<br>
     *               &emsp;&emsp;2 纯数字<br>
     *               &emsp;&emsp;3 字母+数字
     * @return 随机码
     * @date 17.8.22
     */
    public static String getRandomString(int length, int type) {
        // 生成源
        String src;
        switch (type) {
            case 1:
                src = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;
            case 2:
                src = "0123456789";
                break;
            default:
                src = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                break;
        }
        Random random = new Random((long) (Math.random() * 1000));
        String string = "";
        int i;
        for (int j = 0; j < length; j++) {
            i = random.nextInt(src.length());
            string = string.concat(String.valueOf(src.charAt(i)));
        }
        return string;
    }

    /**
     * 获取去除短横线的随机UUID
     *
     * @return 32位uuid
     */
    public static String getRandomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getColorfulString(String src) {
        return "" + src + "";
    }

    public static void main(String[] args) {
        File file = new File("C:\\Files\\123.png");
        System.out.println(file.exists());
        try {
            FileOutputStream stream = new FileOutputStream(file);
            System.out.println(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
