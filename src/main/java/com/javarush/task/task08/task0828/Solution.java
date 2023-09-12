package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Номер месяца
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String month = reader.readLine();
    Map<String, Integer> numOfMonth = new HashMap<>();
    numOfMonth.put("january", 1);
    numOfMonth.put("february", 2);
    numOfMonth.put("march", 3);
    numOfMonth.put("april", 4);
    numOfMonth.put("may", 5);
    numOfMonth.put("june", 6);
    numOfMonth.put("july", 7);
    numOfMonth.put("august", 8);
    numOfMonth.put("september", 9);
    numOfMonth.put("october", 10);
    numOfMonth.put("november", 11);
    numOfMonth.put("december", 12);
    System.out.println(month + " is the " + numOfMonth.get(month.toLowerCase()) + " month");
    //напишите тут ваш код
  }
}