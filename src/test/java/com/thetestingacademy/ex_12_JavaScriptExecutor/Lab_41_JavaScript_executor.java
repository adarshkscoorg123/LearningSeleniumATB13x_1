package com.thetestingacademy.ex_12_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab_41_JavaScript_executor {

    @Test
    public void test_js() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");
        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page");
        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollBy(0,500);");

        Thread.sleep(6000);

        String URL = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(URL);
        System.out.println(title);


    }
}
