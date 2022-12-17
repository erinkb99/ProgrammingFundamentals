package com.bryant.date;
import java.time.*;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;


public class DateExercises {
    public static void main(String[] args) {
        //Exercise 1
        int year = 2020;
        int month = 0; // January
        int date = 1;

        Calendar cal = Calendar.getInstance();
        // Sets the given calendar field value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();

        //Exercise 2
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println();

        //Exercise 3
        System.out.println("\nCurrent Date and Time:" + cal.getTime());
        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
        System.out.println("Actual Maximum Year: "+actualMaxYear);
        System.out.println("Actual Maximum Month: "+actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
        System.out.println();

        // Exercise 4
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
        System.out.println();

        //Exercise 5
        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
        System.out.println();

        //Exercise 6
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();

    }
    }

