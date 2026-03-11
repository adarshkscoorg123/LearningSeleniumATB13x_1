package com.thetestingacademy.ex_15_Selenium_exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab_48_SeleniumExceptions_StaleElement {

    @Test
    public void test_selenium_exceptions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement inputBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));

        driver.navigate().refresh();

        try {
            inputBox.sendKeys("The testing academy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElement exception");
        }
        //org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found

        WebElement inputBox1 = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        inputBox1.sendKeys("TheTestingAcademy"+ Keys.ENTER);



    }
}
