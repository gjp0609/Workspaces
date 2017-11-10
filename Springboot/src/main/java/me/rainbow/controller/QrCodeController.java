package me.rainbow.controller;

import me.rainbow.util.QrCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author guojinpeng
 * @date 17.11.9 14:56
 */
@Controller
@RequestMapping("/qrCode")
public class QrCodeController {

    @RequestMapping("/get")
    public void t2(HttpServletResponse response) {
        System.out.println("get");
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            BufferedImage image = QrCodeUtils.encode("hello");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("image/*");
            if (image != null) {
                ImageIO.write(image, "png", response.getOutputStream());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
