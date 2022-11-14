package com.cydeo.test.day4_xpath_findelements_checkbox;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // 1. go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        // 2. confirm checkbox #1 is not selected by default
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        // 3. confirm checkbox #2 is selected by default
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        // 4. click checkbox #1 to select it
        checkbox1.click();

        // 5. click checkbox #2 to deselect it
        checkbox2.click();

        // 6. confirm checkbox #1 is selected
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
    }
}
