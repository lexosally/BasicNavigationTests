package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main (String[]args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
        String expected = "";
        String actualT ="";
        for (int i = 0; i < urls.size(); i++) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(urls.get(i));
            Thread.sleep(1500);
            expected = driver.getCurrentUrl();
            actualT = driver.getTitle().toLowerCase().replaceAll(" ","");
            if(expected.contains(actualT)){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("expected = " + expected);
                System.out.println("Title = " + actualT);
            }
            driver.quit();
        }
    }
}

