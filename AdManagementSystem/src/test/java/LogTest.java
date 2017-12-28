import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author guojinpeng
 * @date 17.12.28 11:07
 */
public class LogTest {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void t1() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
