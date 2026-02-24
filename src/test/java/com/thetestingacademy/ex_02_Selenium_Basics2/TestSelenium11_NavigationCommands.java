package com.thetestingacademy.ex_02_Selenium_Basics2;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11_NavigationCommands {

    @Test
    @Description("Open the URL")
    public void test_Selenium_Navigation() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://epaper.mysurumithra.com/epaper/edition/2841/mysuru-mithra");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().to("https://www.msn.com/en-in");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
    }
}
