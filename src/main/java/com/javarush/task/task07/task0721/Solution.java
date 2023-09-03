package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = getInts(reader);
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < minimum) minimum = arr[i];

      if (arr[i] > maximum) maximum = arr[i];
    }

    // напишите тут ваш код

    System.out.print(maximum + " " + minimum);
  }

  // напишите тут ваш код
  public static int[] getInts(BufferedReader reader) throws IOException {
    int[] arr = new int[3];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(reader.readLine());
    }
    return arr;
  }
}
