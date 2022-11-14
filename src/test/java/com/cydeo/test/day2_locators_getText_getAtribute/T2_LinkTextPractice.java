package com.cydeo.test.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        // 1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.com
        driver.get("https://practice.cydeo.com/");

        // 3. Click to A/B Testing from tab of the list
        /*driver.findElement(By.linkText(("A/B Testing"))).click();*/
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        /*WebElement abTestLink = driver.findElement(By.partialLinkText("A/B"));*/
        abTestLink.click();

        // 4. Verify testing title is: Expected: NO A/B Test
        String expectedTitle = "NO A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        } else {
            System.out.println("failed!");
        }

        // 5. go back to ham eby using the .back();
        driver.navigate().back();

        // 6. Verify title equals Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        } else {
            System.out.println("failed");
        }
    }
}