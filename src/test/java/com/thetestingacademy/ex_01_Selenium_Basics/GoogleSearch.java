package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // Launch Website
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        driver.navigate().refresh();

        // Store Element in the WebElement
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        searchBox.sendKeys("Mysuru");


        /*WebElement googleSearchBox= driver.findElement(By.xpath("//input[@class=\"gNO89b\"]"));
        googleSearchBox.submit();*/

        searchBox.sendKeys(Keys.ENTER);

    }
}
