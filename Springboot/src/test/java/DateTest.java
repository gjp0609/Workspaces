import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author guojinpeng
 * @date 17.11.24 09:40
 */
public class DateTest {
    public static void main(String[] args) {
        String startDay = "2017-11-17";
        String endDay = "2017-11-30";
        int dayOfWeek;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date startDate = new Date();
        Date endDate = new Date();
        try {
            startDate = format.parse(startDay);
            endDate = format.parse(endDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        do {
            calendar.setTime(startDate);
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.FRIDAY) {
                System.out.println(startDate);
            }
            System.out.println(startDate + " " + endDate);
            startDate = DateUtils.addDays(startDate, 1);
        } while (DateUtils.addDays(endDate, 1).after(startDate));
    }
}
