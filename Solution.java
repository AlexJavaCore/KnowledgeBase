package com.company;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());
    }
}
