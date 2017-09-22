package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by lenovo on 2017/9/22.
 */
public class demo {
    public static void main(String[] args) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String start = sdfDate.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        String end = sdfDate.format(cal.getTime());
        System.out.println(start);
        System.out.println(end);
        System.out.println(2<2);
    }
}
