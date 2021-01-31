package com.basandhya.core.java.java8DateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarJavaExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println("Current date : " + date);
        System.out.println("Current Month : " + month);
        System.out.println("Days of the week : " + today);
        //set date to the first of the month and get the week date of the week
        date = date.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print(" ");
        }
//            while (date.getMonthValue() == month) {
//                System.out.printf("%3d", date.getDayOfMonth());
//                if (date.getDayOfMonth() == today) {
//                    System.out.println("*");
//                } else {
//                    System.out.print(" ");
//                    date = date.plusDays(1);
//                    if (date.getDayOfWeek().getValue() == 1) {
//                        System.out.println();
//                    }
//                    }
//                }
//            }
//
//        }
    }
}
