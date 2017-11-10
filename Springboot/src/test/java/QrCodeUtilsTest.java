import me.rainbow.util.QrCodeUtils;
import org.junit.Test;

import java.io.File;

/**
 * @author guojinpeng
 * @date 17.11.9 11:28
 */
public class QrCodeUtilsTest {
    @Test
    public void encode() {
        File file = new File("C:/Files/1.png");
        String src;
        src = "                System.out.println(bitMatrix.getHeight());\n";
//        src = "https://login.teamviewer.com/123";
//        src = "https://login.teamviewer.com/123https://login.teamviewer.c";
        QrCodeUtils.setSize(1024, 1024);
//        QrCodeUtils.setMinSize(234);
        System.out.println(QrCodeUtils.encode(src));
        System.out.println(QrCodeUtils.decode(file));
    }
}
