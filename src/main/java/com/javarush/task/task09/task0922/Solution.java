package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = reader.readLine().split("-");
    int year = Integer.parseInt(strings[0]) - 1900;
    int month = Integer.parseInt(strings[1]) - 1;
    int day = Integer.parseInt(strings[2]);

    Date date = new Date(year, month, day);
    SimpleDateFormat simpleDateFormat =
        new SimpleDateFormat("MMM dd, yyyy", Locale.forLanguageTag("en"));
    System.out.println(simpleDateFormat.format(date).toUpperCase());
  }
}
