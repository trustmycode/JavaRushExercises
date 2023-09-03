package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String grandfaName = reader.readLine();
    Cat catGrandfa = new Cat(grandfaName);
//    String grandmomName = reader.readLine();
//    Cat catGrandmom = new Cat(grandmomName);
//    String fatherName = reader.readLine();
//    Cat catFather = new Cat(fatherName, null, catGrandfa);
//    String motherName = reader.readLine();
//    Cat catMother = new Cat(motherName, catGrandmom, null);
//    String sonName = reader.readLine();
//    Cat catSon = new Cat(sonName, catMother, catFather);
//    String daughterName = reader.readLine();
//    Cat catDaughter = new Cat(daughterName, catMother, catFather);

    System.out.println(catGrandfa);
//    System.out.println(catGrandmom);
//    System.out.println(catFather);
//    System.out.println(catMother);
//    System.out.println(catSon);
//    System.out.println(catDaughter);
  }

  public static class Cat {

    private final String name;
    private Cat father;
    private Cat mother;

    Cat(String name) {
      this.name = name;
    }

    Cat(String name, Cat mother, Cat father) {
      this.name = name;
      this.mother = mother;
      this.father = father;
    }

    @Override
    public String toString() {
      if (mother == null && father != null) {
        return "The cat's name is " + name + ", no mother, father is " + father.name;
      } else if (father == null && mother != null) {
        return "The cat's name is " + name + ", mother is " + mother.name + " no father";
      } else if (father == null && mother == null) {
        return "The cat's name is " + name + ", no mother, no father";
      } else {
        return "The cat's name is "
            + name
            + ", mother is "
            + mother.name
            + ", father is "
            + father.name;
      }
    }
  }
}
