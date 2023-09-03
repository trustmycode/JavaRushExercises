package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        //напишите тут ваш код
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {

    System.out.println(getDistance(1,1,9,1));
    }
}