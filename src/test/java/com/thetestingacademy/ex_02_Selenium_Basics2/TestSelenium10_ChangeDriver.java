package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium10_ChangeDriver {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver(); // can change the driver
        driver.quit();
    }
}
