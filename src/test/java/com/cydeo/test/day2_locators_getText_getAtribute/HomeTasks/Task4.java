package com.cydeo.test.day2_locators_getText_getAtribute.HomeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        // 1. open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // 3. Click to "Home" link
        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        // 4. Verify title is as Expected: Practice
        String expected = "Practice";
        String actual = driver.getTitle();

        if (actual.equals(expected)){
            System.out.println("passed!");
        } else {
            System.out.println("failed!");
        }
        driver.close();
    }
}
