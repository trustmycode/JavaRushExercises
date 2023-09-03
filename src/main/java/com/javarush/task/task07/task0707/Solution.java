package com.javarush.task.task07.task0707;

/*
Что за список такой?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> arr = new ArrayList<String>();
    for (int i = 0; i < 5; i++) {
      arr.add(i, reader.readLine());
    }
    System.out.println(arr.size());
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }
}
