package com.cydeo.test.day10_javafacer_driver_util;
import org.testng.annotations.Test;
public class TestingSingleton {
    @Test
    public void singleton_understand_test() {
        String str1 = Singleton.getWord("Tree");
        System.out.println(str1);

        String str2 = Singleton.getWord("Sky");
        System.out.println(str2);

        String str3 = Singleton.getWord("Something");
        System.out.println(str3);
    }

    @Test
    public void test2() {
        String str1 = Singleton.getWord("Weather");
        System.out.println(str1);

        String str2 = Singleton.getWord("Moon");
        System.out.println(str2);

        String str3 = Singleton.getWord("Something");
        System.out.println(str3);
    }
}
