package me.gjp0609;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guojinpeng
 * @date 17.11.9 18:47
 */
public class Start {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
