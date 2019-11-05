package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
        } else if (browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
        } else if (browser.equalsIgnoreCase("edge")) {
        System.setProperty("WebDriver.ie.driver", "C:\\Users\\Екатерина Сергеевна\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;
        } else if (browser.equalsIgnoreCase("safari")) {
        return null;
        }else{
        return null;
        }

        }

        }
//public class BrowserFactory {
//
//public static void getDriver (String browserType){
//            WebDriver driver = null;
//            switch(browserType.toLowerCase()){
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                case "edge":
//                    WebDriverManager.edgedriver().setup();
//                    driver = new EdgeDriver();
//break;
//
//            }
//
//    return driver;
//
//    }
//}
