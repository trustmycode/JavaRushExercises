package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»
*/

public class Solution {

  public static Set<String> createSet() {
    Set<String> stringSet = new HashSet<>();
    for (int i = 0; i < 20; i++) {
      stringSet.add("Л");
    }//напишите тут ваш код

    return stringSet;
  }

  public static void main(String[] args) {

  }
}
