package com.cydeo.test.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://library2.cydeo.com/login.html
        driver.get("https://library2.cydeo.com/login.html");

        // 3. Enter username: "Incorrect@gmail.com
        WebElement userInput = driver.findElement(By.id("inputEmail"));
        userInput.sendKeys("Incorrect@gmail.com");

        // 4. Enter password: Incorrect password
        WebElement userPassword = driver.findElement(By.id("inputPassword"));
        userPassword.sendKeys("Incorrect Password" + Keys.ENTER);

        // 5. Verify visually ("Sorry, Wrong Email or Password" displayed
        String expectedResult = "Sorry, Wrong Email or Password";
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//div[@role='alert']")).getText();


        System.out.println(actualResult);
        if (expectedResult.equals(actualResult)){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

    }
}
