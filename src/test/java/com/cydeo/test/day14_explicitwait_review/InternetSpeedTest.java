package com.cydeo.test.day14_explicitwait_review;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InternetSpeedTest {

    @Test
    public void internet_speed_test(){
        // 1. open a Chrome browser ang Go to "https://www.speedtest.net"
        Driver.getDriver().get("https://www.speedtest.net");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        InternetSpeedPage obj = new InternetSpeedPage();

        // 2. wait until Result link is displayed
        wait.until(ExpectedConditions.visibilityOf(obj.resultLink));

        // 3. click go button
        obj.goButton.click();

        // 4. wait until gauge-speed-need
        wait.until(ExpectedConditions.visibilityOf(obj.gaugeSpeedNeedle));

        wait.until(ExpectedConditions.invisibilityOf(obj.gaugeSpeedNeedle));

        System.out.println("obj.downloadSpeed.getText() = " + obj.downloadSpeed.getText());
        System.out.println("obj.downloadSpeed.getText() = " + obj.downloadSpeed.getText());


    }

}
