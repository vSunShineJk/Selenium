package com.cydeo.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerifying {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.cydeo.com");
        String expectedTile = "Cydeo";
        String currentTitle = driver.getTitle();

        if (expectedTile.equals(currentTitle)){
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
        }

        // if the interviewer ask with what are you starting your automation testing I HAVE TO ANSWER FIRST I WILL DO MANUAL TASTING
    }
}
