package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] array = new String[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = reader.readLine();
    }

    sort(array);

    for (String word : array) {
      System.out.println(word);
    }
  }

  public static void sort(String[] array) {
    String buff;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (isGreaterThan(array[j], array[j + 1])) {
          buff = array[j];
          array[j] = array[j + 1];
          array[j + 1] = buff;
        }
      }
    }
    //напишите тут ваш код
  }

  //Метод для сравнения строк: 'а' больше чем 'b'
  public static boolean isGreaterThan(String a, String b) {
    return a.compareTo(b) > 0;
  }
}