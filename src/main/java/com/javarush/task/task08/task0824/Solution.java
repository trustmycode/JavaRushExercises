package com.javarush.task.task08.task0824;

import java.io.FilterOutputStream;
import java.util.ArrayList;

/*
Собираем семейство
*/

public class Solution {

  public static void main(String[] args) {
    Human grandMa1 = new Human();
    Human grandMa2 = new Human();
    Human grandFa1 = new Human();
    Human grandFa2 = new Human();
    Human father = new Human();
    Human mother = new Human();
    Human child1 = new Human();
    Human child2 = new Human();
    Human child3 = new Human();
    grandMa1.name = "Marina";
    grandMa2.name = "Alla";
    grandFa1.name = "John";
    grandFa2.name = "Evgeniy";
    father.name = "Mihail";
    mother.name = "Larisa";
    child1.name = "Vlad";
    child2.name = "Oleg";
    child3.name = "Milena";
    grandMa1.age = 68;
    grandMa2.age = 65;
    grandFa1.age = 67;
    grandFa2.age = 66;
    father.age = 34;
    mother.age = 32;
    child1.age = 13;
    child2.age = 10;
    child3.age = 4;
    grandMa1.sex = false;
    grandMa2.sex = false;
    grandFa1.sex = true;
    grandFa2.sex = true;
    father.sex = true;
    mother.sex = false;
    child1.sex = true;
    child2.sex = true;
    child3.sex = false;
    grandMa1.children.add(father);
    grandFa1.children.add(father);
    grandMa2.children.add(mother);
    grandFa2.children.add(mother);
    father.children.add(child1);
    father.children.add(child2);
    father.children.add(child3);
    mother.children.add(child1);
    mother.children.add(child2);
    mother.children.add(child3);
    System.out.println(grandFa1);
    System.out.println(grandFa2);
    System.out.println(grandMa1);
    System.out.println(grandMa2);
    System.out.println(father);
    System.out.println(mother);
    System.out.println(child1);
    System.out.println(child2);
    System.out.println(child3);
    //напишите тут ваш код
  }

  public static class Human {

    String name;
    boolean sex;
    int age;
    ArrayList<Human> children = new ArrayList<>();
    //напишите тут ваш код

    public String toString() {
      StringBuilder text = new StringBuilder();
      text.append("Имя: ").append(this.name);
      text.append(", пол: ").append(this.sex ? "мужской" : "женский");
      text.append(", возраст: ").append(this.age);

      int childCount = this.children.size();
      if (childCount > 0) {
        text.append(", дети: ").append(this.children.get(0).name);

        for (int i = 1; i < childCount; i++) {
          Human child = this.children.get(i);
          text.append(", ").append(child.name);
        }
      }
      return text.toString();
    }
  }
}