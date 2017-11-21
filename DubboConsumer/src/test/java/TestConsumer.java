import me.gjp0609.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author guojinpeng
 * @date 17.11.9 18:36
 */
public class TestConsumer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        System.out.println("start");
        TestService testService = (TestService) context.getBean("testService"); // 获取远程服务代理
        byte[] bytes = testService.transFile();// 执行远程方法
        try {
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("c:/Files/Data/1.zip")));
            stream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}