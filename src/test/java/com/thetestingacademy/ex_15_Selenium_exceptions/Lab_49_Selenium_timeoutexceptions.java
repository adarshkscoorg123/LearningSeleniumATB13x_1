package com.thetestingacademy.ex_15_Selenium_exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab_49_Selenium_timeoutexceptions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("Start of the program");

        //Timeout exception
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class=\"abc\"]")));
        } catch (TimeoutException e) {
            System.out.println("Timeout exception");
        }

        //Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by.xpath:
        // textarea[@class="abc"] (tried for 10 second(s) with 500 milliseconds interval)

        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        search_inputbox.sendKeys("TheTestingAcademy"+ Keys.ENTER);
    }
}
