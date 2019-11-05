package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsySearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://ebay.com/");
        Thread.sleep(2000);
        WebElement sendK = driver.findElement(By.id("gh-ac"));
        sendK.sendKeys("wooden spoon");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        //WebElement searchButton = driver.findElement(By.id("gh-btn"));
        //Thread.sleep(2000);
        //searchButton.click();
        String result = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText();
        Thread.sleep(2000);
        System.out.println("result = " + result);
        result = result.replaceAll(",","");
        WebElement allBtn = driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/a/span"));
        Thread.sleep(2000);
        allBtn.click();
        String secondResult = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText();
        Thread.sleep(2000);
        System.out.println("secondResult = " + secondResult);
        secondResult = secondResult.replaceAll(",","");
        int firstResult = Integer.parseInt(result);
        int allResult = Integer.parseInt(secondResult);
        if(allResult>firstResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("allResult = " + allResult);
            System.out.println("firstResult = " + firstResult);
        }
        driver.navigate().back();
        String text = driver.findElement(By.id("gh-ac")).getAttribute("value");
        System.out.println("text = " + text);
        if(text.equals("wooden spoon")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("text = " + text);
        }
        driver.navigate().back();
        String checkIfEmpty = driver.findElement(By.id("gh-ac")).getAttribute("value");
        System.out.println("Box is Empty: "+checkIfEmpty.isEmpty());
        driver.close();
    }
}

