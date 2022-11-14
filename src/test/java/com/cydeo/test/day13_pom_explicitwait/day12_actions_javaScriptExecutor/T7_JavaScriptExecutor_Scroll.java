package com.cydeo.test.day13_pom_explicitwait.day12_actions_javaScriptExecutor;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavaScriptExecutor_Scroll {
    @Test
    public void jsScroll() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("env") + "large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement poweredBy = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)", poweredBy);
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }
}
