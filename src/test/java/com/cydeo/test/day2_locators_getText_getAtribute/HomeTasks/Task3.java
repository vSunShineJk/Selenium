package com.cydeo.test.day2_locators_getText_getAtribute.HomeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        // 1. open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to: https://google.com
        driver.get("https://google.com");

        // 3. Click the Gmail from top right
        WebElement Gmail = driver.findElement(By.linkText("Почта"));
        Gmail.click();

        // 4. verify testing contains Expected: Gmail
        String expected = "Gmail";
        String actual = driver.getTitle();

        if (actual.contains(expected)){
            System.out.println("passed!");
        } else {
            System.out.println("failed");
        }

        // 5. Go back to Google by using the .back();
        driver.navigate().back();

        // 6. verify title equals Expected: Google
        expected = "Google";
        actual = driver.getTitle();

        if (actual.equals(expected)){
            System.out.println("passed!");
        } else {
            System.out.println("failed!");
        }

        driver.quit();
    }
}
