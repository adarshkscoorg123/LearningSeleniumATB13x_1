package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium26_Select_Static {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element_select = driver.findElement(By.id("dropdown"));

        Select select = new Select(element_select);
        select.selectByValue("2");
        Thread.sleep(2000);
        select.selectByVisibleText("Option 1");
        Thread.sleep(4000);
        select.selectByIndex(2);
        Thread.sleep(4000);
        select.selectByIndex(1);

        driver.quit();
    }
}
