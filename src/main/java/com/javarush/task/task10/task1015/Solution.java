package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/*
Массив списков строк
*/

public class Solution {
  public static void main(String[] args) {
    ArrayList<String>[] arrayOfStringList = createList();
    printList(arrayOfStringList);
  }

  public static ArrayList<String>[] createList() {
    ArrayList<String>[] arrayOfStringList = new ArrayList[3];
    for (int i = 0; i < arrayOfStringList.length; i++) {
      arrayOfStringList[i] = new ArrayList<>();
      arrayOfStringList[i].add("Suqrowe");
    }

    //напишите тут ваш код

    return arrayOfStringList;
  }

  public static void printList(ArrayList<String>[] arrayOfStringList) {
    for (List<String> list : arrayOfStringList) {
      for (String string : list) {
        System.out.println(string);
      }
    }
  }
}