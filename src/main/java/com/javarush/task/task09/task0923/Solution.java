package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Гласные и согласные
*/

public class Solution {
  public static char[] vowels = new char[] {'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String text = reader.readLine();
    char[] characters = text.toCharArray();
    List<Character> vowelsList = new ArrayList<>();
    List<Character> notVowelsList = new ArrayList<>();
    for (char character : characters) {
      if (isVowel(character))
        vowelsList.add(character);
      else if (character != ' ')
        notVowelsList.add(character);
    }
    for (Character c : vowelsList) {
      System.out.printf("%s ", c);
    }
    System.out.println();
    for (Character c : notVowelsList) {
      System.out.printf("%s ", c);
    }
  }

  // метод проверяет, гласная ли буква
  public static boolean isVowel(char character) {
    character =
        Character.toLowerCase(
            character); // приводим символ в нижний регистр - от заглавных к строчным буквам
    for (char vowel : vowels) { // ищем среди массива гласных
      if (character == vowel) {
        return true;
      }
    }
    return false;
  }
}
