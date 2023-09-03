package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine());
    int e = Integer.parseInt(reader.readLine());
    int buf = 0;
    for (int i = 0; i < 5; i++) {
      if (b < a) {
        buf = a;
        a = b;
        b = buf;
      }
      if (c < b) {
        buf = b;
        b = c;
        c = buf;
      }
      if (d < c) {
        buf = c;
        c = d;
        d = buf;
      }
      if (e < d) {
        buf = d;
        d = e;
        e = buf;
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}