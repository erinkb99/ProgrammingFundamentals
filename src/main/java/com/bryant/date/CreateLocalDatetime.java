package com.bryant.date;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreateLocalDatetime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate date = dateTime.toLocalDate();

        int dayOfMonth = 12;
        int month = 4;
        int year = 2019;
        int hour = 13;
        int minute = 12;

        LocalDateTime dateTime1 = LocalDateTime.of(year, month, dayOfMonth, hour, minute);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("LDT:" + current);
        Timestamp timestamp = Timestamp.valueOf(current);
        System.out.println("SQL timestamp:" + timestamp);

        LocalDateTime dtFromTimeStamp = timestamp.toLocalDateTime();
        System.out.println(dtFromTimeStamp);

        LocalDate myDate = java.time.LocalDate.of(2013, 9, 12);
        LocalTime myTime =LocalTime.of(12, 30);
        LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);


    }
}