package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    // напишите тут ваш ко
    int[] arr = new int[15];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(reader.readLine());
    }
    int streetEven = 0;
    int streetOdd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        streetEven += arr[i];
      } else {
        streetOdd += arr[i];
      }
    }
    if (streetEven > streetOdd)
      System.out.println("В домах с четными номерами проживает больше жителей.");
    else if (streetOdd > streetEven)
      System.out.println("В домах с нечетными номерами проживает больше жителей.");
  }
}
