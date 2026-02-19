package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_code(){
        Assert.assertEquals("Pramod","Pramod");
    }

    @Test
    public void test_OpenTheTestingAcademy(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
        driver.close();

        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://thetestingacademy.com");
        driver1.close();

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.msn.com/en-in");
        //driver2.close();

        EdgeDriver driver3 = new EdgeDriver();
        driver3.get("https://tinybuddha.com/");
    }
}
