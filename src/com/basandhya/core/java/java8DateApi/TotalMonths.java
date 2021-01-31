package com.basandhya.core.java.java8DateApi;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class TotalMonths {

    private static int currentMonth = 0;
    private static boolean increment = false;
    private static int monthDiff = 0;

    public static void main(String[] args) {
    String expDate="07/18/2016";
       int monthDiff= getMonthDiff(expDate);
        System.out.println(monthDiff);
    }

    private static int curTotalMonth() {
        LocalDate date = LocalDate.now();
        return (date.getYear() * 12) + date.getMonthValue();
    }

    private static int expectedTotalMonth(String expectedDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate exDate = LocalDate.parse(expectedDate, formatter);
        return (exDate.getYear() * 12) + exDate.getMonthValue();
    }

    private static int getMonthDiff(String expectedDate) {
        if ((expectedTotalMonth(expectedDate) - curTotalMonth()) > 0) {
            monthDiff = expectedTotalMonth(expectedDate) - curTotalMonth();
            increment = true;
        } else {
            monthDiff = curTotalMonth() - expectedTotalMonth(expectedDate);
        }
        return monthDiff;
    }
}
