package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/*
Работа с датой
*/

public class Solution {
  public static void main(String[] args) {
    System.out.println(isDateOdd("JANUARY 2 2020"));
  }

  public static boolean isDateOdd(String date) {
    Date dateParse = new Date(date);
    Date beginnigOfYear = new Date(date);
    beginnigOfYear.setDate(1);
    beginnigOfYear.setHours(0);
    beginnigOfYear.setMinutes(0);
    beginnigOfYear.setSeconds(0);
    beginnigOfYear.setMonth(Calendar.JANUARY);
    beginnigOfYear.setYear(dateParse.getYear());
    long dateAfterBeginningYear = (dateParse.getTime() - beginnigOfYear.getTime()) / 1000 / 60 / 60 / 24 + 1;
    return !(dateAfterBeginningYear % 2 == 0);
  }
}