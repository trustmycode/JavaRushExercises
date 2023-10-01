package com.javarush.task.task09.task0902;

/*
И снова StackTrace
*/

public class Solution {
  public static void main(String[] args) {
    method1();
  }

  public static String method1() {
    method2();
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    System.out.println(elements[elements.length - 1].getMethodName());
    return elements[0].getMethodName();
  }

  public static String method2() {
    method3();
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    System.out.println(elements[elements.length - 1].getMethodName());
    return Thread.currentThread().getName();
    //напишите тут ваш код
  }

  public static String method3() {
    method4();
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    System.out.println(elements[elements.length - 1].getMethodName());
    return Thread.currentThread().getName();
    //напишите тут ваш код
  }

  public static String method4() {
    method5();
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    System.out.println(elements[elements.length - 1].getMethodName());
    return Thread.currentThread().getName();
    //напишите тут ваш код
  }

  public static String method5() {
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    System.out.println(elements[elements.length - 1].getMethodName());
    return Thread.currentThread().getName();
    //напишите тут ваш код
  }
}