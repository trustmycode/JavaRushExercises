package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
  public static void main(String[] args) {
    Map<String, String> map = createPeopleMap();
    printPeopleMap(map);
  }

  public static Map<String, String> createPeopleMap() {
    Map<String, String> map = new HashMap<>();
    map.put("Qwer","QQwe");
    map.put("Qwer","SDAWw");
    map.put("Asd","AAsd");
    map.put("Zxc","ZZxc");
    map.put("Qaz","QQaz");
    map.put("Wsx","ZZxc");
    map.put("Edc","ZZxc");
    map.put("Zvxcz","WERwf");
    map.put("QWsd","XCVZes");
    map.put("ACVA","Rcasc");
    return map;
  }

  public static void printPeopleMap(Map<String, String> map) {
    for (Map.Entry<String, String> s : map.entrySet()) {
      System.out.println(s.getKey() + " " + s.getValue());
    }
  }
}