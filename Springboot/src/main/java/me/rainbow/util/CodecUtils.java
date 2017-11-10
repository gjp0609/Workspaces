package me.rainbow.util;


import org.apache.commons.codec.binary.Base64;

import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;

/**
 * @author guojinpeng
 * @date 17.11.9 15:00
 */
public class CodecUtils {

    public static void xx(BufferedImage image) throws UnsupportedEncodingException {
        byte[] data = null;


        byte[] encodeBase64 = Base64.encodeBase64("ad".getBytes("UTF-8"));
    }
}
