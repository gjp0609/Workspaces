package me.gjp0609;

/**
 * 公共接口
 *
 * @author guojinpeng
 * @date 17.11.9 18:29
 */
public interface TestService {
    /**
     * 返回Hello
     *
     * @param name name
     * @return hello
     */
    public String getHello(String name);

    /**
     * 文件传输
     *
     * @return 文件转换为数组
     */
    public byte[] transFile();
}
