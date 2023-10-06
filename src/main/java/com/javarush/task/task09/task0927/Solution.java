package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class Solution {
  public static void main(String[] args) {
    Map<String, Cat> map = createMap();
    Set<Cat> set = convertMapToSet(map);
    printCatSet(set);
  }

  public static Map<String, Cat> createMap() {
    Map<String, Cat> cats = new HashMap<>();

    cats.put("Vasya", new Cat("Vasya"));
    cats.put("Rizhik", new Cat("Rizhik"));
    cats.put("Graf", new Cat("Graf"));
    cats.put("Brodyaga", new Cat("Brodyaga"));
    cats.put("Pushistik", new Cat("Pushistik"));
    cats.put("Cat", new Cat("Cat"));
    cats.put("Mariya", new Cat("Mariya"));
    cats.put("Jizel", new Cat("Jizel"));
    cats.put("Zabiyaka", new Cat("Zabiyaka"));
    cats.put("Marsh", new Cat("Marsh"));

    return cats;
  }

  public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
    Set<Cat> catSet = new HashSet<>();
    for (Map.Entry<String, Cat> entry : map.entrySet()) {
      catSet.add(entry.getValue());
    }
    return catSet;
  }

  public static void printCatSet(Set<Cat> set) {
    for (Cat cat : set) {
      System.out.println(cat);
    }
  }

  public static class Cat {
    private String name;

    public Cat(String name) {
      this.name = name;
    }

    public String toString() {
      return "Cat " + this.name;
    }
  }

}
