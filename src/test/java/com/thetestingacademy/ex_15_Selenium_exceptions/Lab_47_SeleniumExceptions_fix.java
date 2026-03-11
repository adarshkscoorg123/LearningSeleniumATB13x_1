package com.thetestingacademy.ex_15_Selenium_exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab_47_SeleniumExceptions_fix {

    @Test
    public void test_selenium_exceptions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.id("Pramod"));
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
        }
    }

}
