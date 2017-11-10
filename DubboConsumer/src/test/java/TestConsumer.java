import me.gjp0609.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guojinpeng
 * @date 17.11.9 18:36
 */
public class TestConsumer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
//        context.start();

        TestService testService = (TestService) context.getBean("testService"); // 获取远程服务代理
        String hello = testService.getHello("Tom"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}