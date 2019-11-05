package com.cbt.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class NavigationTests2 {
    public static void main(String[] args) {

    }
    private static void googleTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();

    }
    private static void etsyTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();


        driver.navigate().forward();


    }

    private static void googleFox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        String googleFox = driver.getTitle();
    }
    private static void etsyFox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com/");
        String etsyFox = driver.getTitle();
    }

    private static void googleEdge(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        String googleEdge = driver.getTitle();
    }

    private static void etsyEdge(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.etsy.com/");
        String etsyEdge = driver.getTitle();
    }
}
