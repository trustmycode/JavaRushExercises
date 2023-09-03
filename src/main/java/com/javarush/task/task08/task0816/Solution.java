package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {

  public static Map<String, Date> createMap() throws ParseException {
    DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
    Map<String, Date> map = new HashMap<>();
    map.put("Смирнов", dateFormat.parse("JANUARY 1 2012"));
    map.put("Fcxv", dateFormat.parse("FEBRUARY 11 2016"));
    map.put("Zcxv", dateFormat.parse("MARCH 11 2016"));
    map.put("Qwer", dateFormat.parse("APRIL 21 2001"));
    map.put("Qazx", dateFormat.parse("MAY 21 2001"));
    map.put("Wsxc", dateFormat.parse("JUNE 21 2001"));
    map.put("Edcv", dateFormat.parse("JULY 21 2001"));
    map.put("Zxsa", dateFormat.parse("AUGUST 21 2001"));
    map.put("Qwsa", dateFormat.parse("SEPTEMBER 21 2001"));
    map.put("Ewqa", dateFormat.parse("DECEMBER 21 2001"));
    return map;
  }

  public static void removeAllSummerPeople(Map<String, Date> map) {
    Map<String, Date> dateMap = new HashMap<>();
    for (Entry<String, Date> entry : map.entrySet()) {
      int month = entry.getValue().getMonth();
      if (month < 5 || month > 7) {
        dateMap.put(entry.getKey(), entry.getValue());
      }
    }
    map.clear();
    map.putAll(dateMap);
  }

  public static void main(String[] args) {

  }
}