package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
    // TASK: NEW METHOD CREATION
    // Method name: getDriver
    // Static method
    // Accepts String arg: browserType
    //  - this arg will determine what type of browser is opened
    //  - if "chrome" passed --> it will oen chrome browser
    //  - if "firefox" passed --> it will open firefox browser
    // RETURN TYPE: "WebDriver"

    public static WebDriver getDriver(String BrowserType){
        if (BrowserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (BrowserType.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else {
            System.out.println("Give browser type does not exist/or not currently supported!");
            return null;
        }
    }

}
