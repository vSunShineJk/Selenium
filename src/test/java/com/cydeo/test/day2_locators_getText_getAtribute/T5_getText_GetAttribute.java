package com.cydeo.test.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://practice.cydeo.com/registration_form");

        String expectedTitle = "Registration form";
        if (webDriver.findElement(By.tagName("h2")).getText().equals(expectedTitle)) {
            System.out.println("test title PASSED");
        } else {
            System.out.println("test title FAILED");
        }

        String expectedPlaceholder = "first name";
        if (webDriver.findElement(By.name("firstname")).getAttribute("placeholder").equals(expectedPlaceholder)) {
            System.out.println("Test placeholder PASSED");
        } else {
            System.out.println("Test placeholder FAILED");
        }

        webDriver.quit();
    }
}
