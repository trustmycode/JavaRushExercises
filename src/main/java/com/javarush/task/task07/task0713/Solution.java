package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    // напишите тут ваш код
    ArrayList<Integer> numsArr = new ArrayList<Integer>();
    ArrayList<Integer> numsMod3 = new ArrayList<Integer>();
    ArrayList<Integer> numsMod2 = new ArrayList<Integer>();
    ArrayList<Integer> numsAny = new ArrayList<Integer>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 20; i++) {
      numsArr.add(Integer.parseInt(reader.readLine()));
    }
    for (int i = 0; i < numsArr.size(); i++) {
      if (numsArr.get(i) % 3 == 0) {
        numsMod3.add(numsArr.get(i));
      }
      if (numsArr.get(i) % 2 == 0) {
        numsMod2.add(numsArr.get(i));
      }
      if (!(numsArr.get(i) % 2 == 0) && !(numsArr.get(i) % 3 == 0)) {
        numsAny.add(numsArr.get(i));
      }
    }
    printList(numsMod3);
    printList(numsMod2);
    printList(numsAny);
  }

  public static void printList(ArrayList<Integer> list) {
    // напишите тут ваш код
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
