package me.rainbow.util;

/**
 * @author guojinpeng
 * @date 17.9.29 18:05
 */
@SuppressWarnings("unused")
public class ColorUtils {

    public static String getColorString(String string, Color... colors) {
        StringBuilder s = new StringBuilder();
        for (Color color : colors) {
            s.append("\033[");
            s.append(color.getValue());
            s.append("m");
        }
        s.append(string);
        s.append("\033[0m");
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(getColorString("hello", Color.RED, Color.UNDER_LINE, Color.Co));
    }
}
