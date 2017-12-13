package me.rainbow.util;

/**
 * @author guojinpeng
 * @date 17.9.29 18:06
 */

/*
        log.info("\033[1m粗体\033[0m");
        log.info("\033[4m下划线\033[0m");
        log.info("\033[7m反色\033[0m");
        log.info("\033[30m白色\033[0m");
        log.info("\033[31m红色\033[0m");
        log.info("\033[32m绿色\033[0m");
        log.info("\033[33m黄色\033[0m");
        log.info("\033[34m蓝色\033[0m");
        log.info("\033[35m紫色\033[0m");
        log.info("\033[36m青色\033[0m");
        log.info("\033[37m灰色\033[0m");
        log.info("\033[40mAAA\033[0m");
        log.info("\033[41mAAA\033[0m");
        log.info("\033[42mAAA\033[0m");
        log.info("\033[43mAAA\033[0m");
        log.info("\033[44mAAA\033[0m");
        log.info("\033[45mAAA\033[0m");
 */
public enum Color {
    BOLD("粗体", 1),
    UNDER_LINE("", 4),
    Co("", 7),
    RED("红色", 31),
    REAL_ESTATE("房地产", 23);

    private String name;
    private int value;

    Color(String name, int index) {
        this.name = name;
        this.value = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
