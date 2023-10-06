package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/*
Список из массивов чисел
*/

public class Solution {
  public static void main(String[] args) {
    ArrayList<int[]> list = createList();
    printList(list);
  }

  public static ArrayList<int[]> createList() {
    ArrayList<int[]> list = new ArrayList<>();
    list.add(new int[5]);
    list.add(new int[2]);
    list.add(new int[4]);
    list.add(new int[7]);
    list.add(new int[0]);
    for (int[] ints : list) {
      for (int i = 0; i < ints.length; i++) {
        ints[i] = (int) (Math.random() * 1000);
      }
    }
    return list;
  }

  public static void printList(ArrayList<int[]> list) {
    for (int[] array : list) {
      for (int x : array) {
        System.out.println(x);
      }
    }
  }
}