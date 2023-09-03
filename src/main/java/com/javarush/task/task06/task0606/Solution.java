package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

  public static int even;
  public static int odd;

  public static void main(String[] args) throws IOException {
    BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(cons.readLine());
    int a;
    while (num > 0) {
      a = num % 10;
      num /= 10;
      if (a % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println("Even: " + even + " Odd: " + odd);
  }
}
