package com.company;

import java.io.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatting {
    public static void main(String[] args) throws Exception {
        // current date
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // add one week
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        // short date
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        // date formatting
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        // get date and parse it
        Date newDate = simpleDateFormat.parse("05/12/1963 05:22");
        System.out.println(newDate);
    }
}
