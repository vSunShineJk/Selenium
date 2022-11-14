package com.cydeo.test.day4_xpath_findelements_checkbox;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());

        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));
        }

        driver.close();
    }
}
