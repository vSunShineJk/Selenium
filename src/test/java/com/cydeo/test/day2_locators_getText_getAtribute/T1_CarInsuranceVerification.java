package com.cydeo.test.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CarInsuranceVerification {
    public static void main(String[] args) {


        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2. Go to https://www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login");


        // 3. Verify URL contains Expected: "excelsoirinsurance"
        String expectedURL = "excelsoirinsurance"; // comes from requirement
        String actualURL = driver.getCurrentUrl(); // come from browser

            /* if(driver.getCurrentURL().contains("exlsoirinsurance") --> is also possible but not recommended.*/
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification is PASSED!");
        } else {
            System.out.println("URL verification is FAILED!");
        }

        // 4. Verify title: Expected : "Login | Excelsior Insurance
        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("TitleVerification passed!");
        } else {
            System.out.println("TitleVerification failed!");
        }

        driver.close();
    }
}
