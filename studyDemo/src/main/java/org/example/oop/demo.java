package org.example.oop;

import java.time.LocalDate;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        Date date = new Date();
        if (date != null) {
            System.out.println(date);
        }

        String s = new Date().toString();
        System.out.println(s);//日历与时间
        System.out.println(new Date());

        LocalDate localDate = LocalDate.now();//年月日
        System.out.println(localDate);
        LocalDate newYear = LocalDate.of(2022, 1, 1);
        System.out.println(newYear);

        int year  = localDate.getYear();
        System.out.println(year);

        LocalDate later = localDate.plusDays(1000);
        System.out.println(later);

    }
}
