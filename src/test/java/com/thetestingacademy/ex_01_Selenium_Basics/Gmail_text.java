package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail_text {


    @Test
        public void startTheBrowser(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //a[text()="Gmail"]
        //a[contains(text(),"Gmail")]

        WebElement gmail_element = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
        String gmail_text = gmail_element.getText();
        System.out.println(gmail_text);
        gmail_element.click();

        //span[text()="Sign in"]
        //span[contains(text(),"Sign")]

        WebElement gmail_signIn = driver.findElement(By.xpath("//span[contains(text(),\"Sign\")]"));
        gmail_signIn.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
