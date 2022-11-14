package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoOption {
    public static void main(String[] args) {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        //3- Test if driver id working
        driver.get("https://www.google.com");
    }
}
