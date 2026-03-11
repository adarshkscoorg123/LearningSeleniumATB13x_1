package com.thetestingacademy.ex_15_Selenium_exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab_46_SeleniumExceptions {

    @Test
    public void test_selenium_exceptions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement input = driver.findElement(By.id("Pramod"));
        input.click();

       // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#Pramod"}
       // (Session info: chrome=145.0.7632.117)
    }
}
