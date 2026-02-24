package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium15_OptionClasses {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        EdgeOptions edgeOptions =new EdgeOptions();

        edgeOptions.addArguments("--inprivate");
        edgeOptions.addArguments("--start-maximized");
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--window-size=600,800");

        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");


        //So we have FireFox options,Chrome options,Edge options, Safari options
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebDriver driver1 = new EdgeDriver(edgeOptions);
        driver1.get("https://app.vwo.com/#/login");
    }
}
