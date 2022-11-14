package com.cydeo.test.day3_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) {
        // 1. open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();

        // 2. go to: https://login1_nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3. Enter incorrect username: "incorrect"
        WebElement userInput = driver.findElement(By.name("USER_LOGIN"));
        userInput.sendKeys("Incorrect");

        // 4. enter incorrect password: "incorrect"
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        // 5. click to log in button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        // 6. verify error message text is as expected:
        //       Expected: incorrect login or password

        String expected = "Incorrect login or password";
        String actual = driver.findElement(By.className("errortext")).getText();

        if (actual.equals(expected)){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        driver.close();
    }
}
