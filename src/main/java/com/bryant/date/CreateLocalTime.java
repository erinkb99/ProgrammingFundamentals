package com.bryant.date;

import java.time.LocalTime;

public class CreateLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        int hour1=23;
        int minute1=34;
        int seconds1=45;
        LocalTime time1=LocalTime.of(hour1, minute1, seconds1);

        LocalTime markerTime=LocalTime.of(14, 30);
        LocalTime set1=LocalTime.of(11,03,12);
        System.out.println("Is before" + set1.isBefore(markerTime));

        LocalTime current = LocalTime.now();
        LocalTime twoHours = current.plusHours(2);
        LocalTime sixtyMin = current.plusMinutes(60);

        String timeString = "12:01:01";
        LocalTime timeFromString = LocalTime.parse(timeString);

    }
}
