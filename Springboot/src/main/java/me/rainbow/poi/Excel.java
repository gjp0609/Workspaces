package me.rainbow.poi;

/**
 * @author guojinpeng
 * @date 17.12.13 13:41
 */
public @interface Excel {
    String name();

    String format() default "";

    double width() default 10D;

    double height() default 10D;

    String[] replace() default {};

    String group() default "";

    /**
     * 在表格中的先后顺序，默认0无序
     */
    int order() default 0;
}
