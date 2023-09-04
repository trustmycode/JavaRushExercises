package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
Только для богачей
*/

public class Solution {

  public static Map<String, Integer> createMap() {
    Map<String, Integer> map = new HashMap<>();
    map.put("Asdf", 500);
    map.put("Qwer", 450);
    map.put("Zxcv", 1500);
    map.put("Qazw", 600);
    map.put("Wsxe", 700);
    map.put("Edcr", 300);
    map.put("Zaqw", 340);
    map.put("Xswe", 1000);
    map.put("Rfds", 900);
    map.put("Vcxz", 700);
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    for (Iterator<Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
      int val = it.next().getValue();
      if (val < 500) {
        it.remove();
      }
    }
  }

  public static void main(String[] args) {

  }
}