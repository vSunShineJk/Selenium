package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        // 1. open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        // 3. Click to "Hockey" radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id=\"hockey\"]"));
        hockeyButton.click();

        // 4. Verify  "Hockey" radio button is selected after clicking
        System.out.println((hockeyButton.isSelected()) ? "Passed!" : "Failed!");

        // 5. Test all radio buttons, if there are clickable
        List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement each : sportRadioBtns) {
            each.click();
            System.out.println((each.isSelected() ? each.getAttribute("id")+" button is clicked" : each.getAttribute("id")+" button is unclickable"));
            Thread.sleep(2000);
        }

        driver.close();
    }
}
