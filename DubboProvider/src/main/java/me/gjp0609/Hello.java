package me.gjp0609;

import java.io.*;

/**
 * @author guojinpeng
 * @date 17.11.9 18:30
 */
public class Hello implements TestService {

    public String getHello(String name) {
        return "hello, " + name;
    }

    public byte[] transFile() {
        File file = new File("c:/Files/Data/123.zip");
        byte[] buffer = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            buffer = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer;
    }

}
