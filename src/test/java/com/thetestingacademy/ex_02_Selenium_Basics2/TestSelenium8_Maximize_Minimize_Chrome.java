package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium8_Maximize_Minimize_Chrome {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(5000);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();
    }
}
