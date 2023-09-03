package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная последовательность
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    List<Integer> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 10; i++) {
      int val = Integer.parseInt(reader.readLine());
      list.add(val);
    }
    int count = 1;
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
      if (max < count) {
        max = count;
      }
      if (i != list.size() - 1 && list.get(i).equals(list.get(i + 1))) {
        count++;
      } else if (i == list.size() - 1 && list.get(i).equals(list.get(i - 1))) {
        count++;
      } else {
        count = 1;
      }
    }
    System.out.println(max);
  }
}