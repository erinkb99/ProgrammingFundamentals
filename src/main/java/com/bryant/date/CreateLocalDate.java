package com.bryant.date;
import java.time.*;
import java.util.Date;

public class CreateLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = 1969;
        int month = 8;
        int dayOfMonth = 15;

        LocalDate date1 = LocalDate.of(year, month, dayOfMonth);
        System.out.println(date1);

        Month monthOfDate = date1.getMonth();
        System.out.println(monthOfDate);

        int monthInInteger = date1.getMonthValue();
        System.out.println(monthInInteger);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate currentPlusFive = date.plusDays(5);
        System.out.println("5 days from now: " + currentPlusFive);

        LocalDate afterOneMonth = currentPlusFive.plusMonths(1);
        System.out.println("1 month from now: " + afterOneMonth);

        int lengthOfMonth = date.lengthOfMonth();
        System.out.println(lengthOfMonth);

        Date dt = new Date();
        LocalDate localDateFromDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(dt + "--" + localDateFromDate);

        String dateString = "2020-09-12";
        LocalDate dateFromString = LocalDate.parse(dateString);
        System.out.println(dateFromString);

        String stringFromDate = dateFromString.toString();
        System.out.println(stringFromDate);
    }
}
