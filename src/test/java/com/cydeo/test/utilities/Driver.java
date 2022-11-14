package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

    public class Driver {
        private static WebDriver webDriver;
        private Driver() {}

        public static WebDriver getDriver() {
            if (webDriver == null) {
                String browser = ConfigurationReader.getProperty("browser");
                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        webDriver = new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        webDriver = new FirefoxDriver();
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        webDriver = new EdgeDriver();
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        webDriver = new SafariDriver();
                        break;
                    case "opera":
                        WebDriverManager.operadriver().setup();
                        webDriver = new OperaDriver();
                        break;
                    case "explorer":
                        WebDriverManager.iedriver().setup();
                        webDriver = new InternetExplorerDriver();
                        break;
                    default:
                        throw new IllegalArgumentException("unknown browser type - " + browser);
                }
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

            return webDriver;
        }

        public static void closeDriver() {
            if (webDriver != null)
                webDriver.quit(); // this will kill the session but driver will not be null
        }
    }

//public class Driver {
//
//    /*
//     * Making our driver "driver" instance private, so that it is not reachable from outside the class
//     * We make it static, because we want it to run before anything else, also we will use it in static method
//     * */
//    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
//
//    /*
//     * Creating a private constructor, so we are closing access to the object this class from outside any class
//     * */
//    private Driver() {
//    }
//
//    /*
//     * Create re-usable utility method which will return some driver instance when we call it.
//     * */
//    public static WebDriver getDriver() {
//        if (driverPool.get() == null) { // if driver/browser was never opened
//            String browserType = ConfigurationReader.getProperty("browser");
//
//            /*
//             * Depending on the browserType our switch statement will determine to open specific type of browser/driver
//             * */
//            switch (browserType) {
//                case "chrome": {
//                    WebDriverManager.chromedriver().setup();
//                    driverPool.set(new ChromeDriver());
//                    break;
//                }
//                case "firefox": {
//                    WebDriverManager.firefoxdriver().setup();
//                    driverPool.set(new FirefoxDriver());
//                    break;
//                }
//            }
//            driverPool.get().manage().window().maximize();
//            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }
//
//        /*
//         * Some driver instance will be returned every time we call Driver.getDriver() method
//         * */
//        return driverPool.get();
//    }
//
//    public static void closeDriver() {
//        if (driverPool.get() != null) {
//            driverPool.get().quit(); // this line will kill the session, value will not be null
//            driverPool.set(null);
//        }
//    }
//}