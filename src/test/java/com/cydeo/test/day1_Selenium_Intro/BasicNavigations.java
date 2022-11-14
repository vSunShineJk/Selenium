package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        // making screen full screen
        driver.manage().window().maximize();

        // 3. go to "https://www.tesla.com"
        //driver.get("https://www.tesla.com");

        // navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.tesla.com"); // this method doing the same thing as the code in line 17.

        // WE SHOULD NOT USE IT -> THREAD.SLEEP(3000);

        // stops the execution of the code for 3 sec
        Thread.sleep(3000);

        // navigate().back method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String CurrentTitle = driver.getTitle();
        System.out.println("title "+CurrentTitle);
        //System.out.println("Driver.getTitle() = "+driver.getTitle());

        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl"+currentUrl);

        // close() method will close current opened page
        //driver.close();

        // quit() method will close all opened pages
        //driver.quit();

        driver.get("https:///www.google.com");


    }
}
