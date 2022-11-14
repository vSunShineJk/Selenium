package com.cydeo.test.day4_xpath_findelements_checkbox;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_path_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement Home = driver.findElement(By.cssSelector("body > nav > ul > li > a"));
        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
        WebElement Email = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement emailInputBox = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>input "));
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@class='radius']"));

        System.out.println("Home.isDisplayed() = " + Home.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("Email.isDisplayed() = " + Email.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrieveButton.isDisplayed() = " + retrieveButton.isDisplayed());

        driver.close();
    }
}
