package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium6_SeleniumCommands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        driver.close();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.msn.com/en-in");
        Thread.sleep(5000);
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());

        driver1.navigate().to("https://app.vwo.com");
        driver1.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        driver1.quit();
    }
}
