package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_click {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        WebElement gmail_advertising = driver.findElement(By.linkText("Advertising"));
        //gmail_advertising.click();

        WebElement gmail_images = driver.findElement(By.linkText("Images"));
        String attribute = gmail_images.getAttribute("aria-label");
        System.out.println(attribute);
        gmail_images.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
