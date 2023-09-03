package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {

  public static Set<Integer> createSet() {
    Set<Integer> set = new HashSet<>();// напишите тут ваш код
    for (int i = 0; i < 20; i++) {
      set.add(i);
    }
    return set;
  }

  public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
    // напишите тут ваш код
    Set<Integer> integerSet = new HashSet<>();
    for (Integer integer : set) {
      if (integer > 10) {
        integerSet.add(integer);
      }
    }
    set.removeAll(integerSet);
    return set;
  }

  public static void main(String[] args) {
    Set<Integer> set;
    set = createSet();
    System.out.println(set);
    set = removeAllNumbersGreaterThan10(set);
    System.out.println(set);
  }
}