package com.cydeo.test.day2_locators_getText_getAtribute.HomeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // Verify header text Expected: Log in to ZeroBank
        String expectedText = "Log in to ZeroBank";

        if (driver.findElement(By.tagName("h3")).getText().equals(expectedText)){
            System.out.println("test title passed!");
        } else {
            System.out.println("test title failed!");
        }
    }
}
