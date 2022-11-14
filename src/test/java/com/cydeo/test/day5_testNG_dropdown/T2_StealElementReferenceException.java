package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_StealElementReferenceException {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElementBtn.click();

        WebElement deletedBtn = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        deletedBtn.click();

        try {
            System.out.println("deletedBtn.isDisplayed() = " + deletedBtn.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("=========");
        }

        driver.close();
    }
}
