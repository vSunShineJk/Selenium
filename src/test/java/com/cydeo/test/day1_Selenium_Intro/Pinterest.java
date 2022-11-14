package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinterest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://pinterest.com");
        String expected = "Pinterest";
        String actual = driver.getTitle();

        if (expected.equals(actual)){
            System.out.println("OMG finally you find the sense of your life, it is of course correct! BRAVO TO YOU!!!");
        } else {
            System.out.println("your whole life was wrong, This is your mistake. Please let me bring to you a rope");
        }
    }
}
