package me.gjp0609;

/**
 * @author guojinpeng
 * @date 17.11.9 18:30
 */
public class Hello implements TestService {

    public String getHello(String name) {
        return "hello, " + name;
    }
}
