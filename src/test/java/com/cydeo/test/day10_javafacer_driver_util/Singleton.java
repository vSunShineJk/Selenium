package com.cydeo.test.day10_javafacer_driver_util;

public class Singleton {
    private static String word;

    private Singleton(){}

    public static String getWord(String newWord) {
        if (word == null) {
            System.out.println("First time call. Word object is null. Assigning the value now");
            word = newWord;
        } else {
            System.out.println("Word already has value");
        }
        return word;
    }
}
