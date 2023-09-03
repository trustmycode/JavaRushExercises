package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
  public static void main(String[] args) throws Exception {
    // напишите тут ваш код
    int[] arr20 = new int[20];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < arr20.length; i++) {
      arr20[i] = Integer.parseInt(reader.readLine());
    }
    int[] arr10_1 = new int[10];
    int[] arr10_2 = new int[10];
    for (int i = 0; i < arr10_1.length; i++) {
      arr10_1[i] = arr20[i];
      arr10_2[i] = arr20[i + arr20.length / 2];
    }
    for (int i = 0; i < arr10_2.length; i++) {
      System.out.println(arr10_2[i]);
    }
  }
}
