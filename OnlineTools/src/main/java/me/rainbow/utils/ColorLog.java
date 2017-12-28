package me.rainbow.utils;


import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author guojinpeng
 * @date 17.12.26 17:41
 */
public class ColorLog extends PatternLayout {
    @Override
    public String doLayout(ILoggingEvent event) {
        String layout = super.doLayout(event);
        return StringUtil.getColorfulString(layout, Color.PURPLE);
    }
}
