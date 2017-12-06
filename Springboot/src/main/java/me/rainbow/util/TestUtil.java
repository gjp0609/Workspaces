package me.rainbow.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author guojinpeng
 * @date 17.11.23 15:53
 */
public class TestUtil {

    public static <X> List<X> getXList(List<X> users) {
        TreeSet<X> set = new TreeSet<X>(new Comparator<X>() {
            @Override
            public int compare(X x1, X x2) {
                int i = 0;
                try {
                    String phone1 = String.valueOf(x1.getClass().getMethod("getPhone").invoke(x1));
                    String phone2 = String.valueOf(x2.getClass().getMethod("getPhone").invoke(x2));
                    i = phone1.compareTo(phone2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return i;
            }
        });
        set.addAll(users);
        return new ArrayList<X>(set);
    }
}
