package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com");
        String exp = driver.getTitle();

        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            StringUtility.verifyEquals(exp, driver.getTitle());
        }

        String expectedUrl = "http://practice.cybertekschool.com";
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            if(driver.getCurrentUrl().startsWith(expectedUrl)){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
                System.out.println("exp = " + exp);
                System.out.println(driver.getTitle());
            }

        }

        driver.quit();






    }
}

