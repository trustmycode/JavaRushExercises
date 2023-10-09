package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
  public static void main(String[] args) {}

  public static class Human {
    private int age;
    private String firstname;
    private String lastname; // Напишите тут ваши переменные и конструкторы
    private int height;
    private String residentialAddress;
    private boolean sex;

    public Human() {
      this(0, null, null, 0, null, false);
    }

    public Human(
        int age, String firstname, String lastname, int height, String residentialAddress) {
      this.age = age;
      this.firstname = firstname;
      this.lastname = lastname;
      this.height = height;
      this.residentialAddress = residentialAddress;
    }

    public Human(int age) {
      this.age = age;
    }

    public Human(boolean sex) {
      this.sex = sex;
    }

    public Human(String firstname) {
      this.firstname = firstname;
    }

    public Human(String firstname, String lastname) {
      this(0, firstname, lastname);
    }

    public Human(int age, String firstname, String lastname) {
      this(age, firstname, lastname, false);
    }

    public Human(String firstname, String lastname, String residentialAddress) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.residentialAddress = residentialAddress;
    }

    public Human(int age, String firstname, String lastname, boolean sex) {
      this.age = age;
      this.firstname = firstname;
      this.lastname = lastname;
      this.sex = sex;
    }

    public Human(
        int age,
        String firstname,
        String lastname,
        int height,
        String residentialAddress,
        boolean sex) {
      this.age = age;
      this.firstname = firstname;
      this.lastname = lastname;
      this.height = height;
      this.residentialAddress = residentialAddress;
      this.sex = sex;
    }
  }
}
