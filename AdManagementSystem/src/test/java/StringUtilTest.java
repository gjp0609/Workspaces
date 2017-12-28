import me.rainbow.utils.StringUtil;
import org.junit.Test;

/**
 * @author guojinpeng
 * @date 17.12.28 10:58
 */
public class StringUtilTest {

    @Test
    public void t1() {
        String string = StringUtil.getRandomString(12);
        System.out.println(string);
    }
}
