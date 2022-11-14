package com.cydeo.test.day13_pom_explicitwait.day12_actions_javaScriptExecutor;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {
    @Test
    public void test_4_and_5_test() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("env"));

        Actions actions = new Actions(Driver.getDriver());

        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        actions.moveToElement(poweredByCydeo).perform();
        BrowserUtils.sleep(1);
        WebElement homeButton = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        actions.moveToElement(homeButton).perform();
        BrowserUtils.sleep(1);
        actions.moveToElement(poweredByCydeo).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
