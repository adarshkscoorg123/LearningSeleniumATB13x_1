package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium12_NoHTTP {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("www.google.com"); // HTTP/HTTPs are important to include
        //-> Since without that it doesn't work
        driver.quit();
    }
}
