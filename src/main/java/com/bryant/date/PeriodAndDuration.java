package com.bryant.date;

import java.time.*;

public class PeriodAndDuration {
    public static void main(String[] args) {
        LocalDate joiningDate=LocalDate.of(2015, 7, 12);
        LocalDate resignDate= LocalDate.now();

        Period period= Period.between(joiningDate, resignDate);
        int years = period.getYears();
        System.out.println("Years:" + years);

        long totalMonths = period.toTotalMonths();
        System.err.println(totalMonths);

        LocalTime startTIme= LocalTime.of(10, 12, 12);
        LocalTime endTIme=LocalTime.now();

        Duration duration = Duration.between(startTIme, endTIme);
        System.out.println(duration);

        System.out.println("Hours:" + duration.toHours());

    }

}
