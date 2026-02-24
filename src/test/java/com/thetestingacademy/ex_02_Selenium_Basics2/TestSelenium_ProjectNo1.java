package com.thetestingacademy.ex_02_Selenium_Basics2;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 {


    @Description("TC#1-Verify that a particular text exists on the Katalon Website")
    @Link("https://bugz.attlassian.net/browse/VP-1")

    @Test
    public void test_verify_text_katalon(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        if (driver.getTitle().startsWith("CURA")){
            System.out.println("Test case is Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test case is failed");
            Assert.fail();
        }

        if (driver.getCurrentUrl().endsWith(".com/")){
            System.out.println("Test case is Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test case is failed");
            Assert.fail();
        }

        if (driver.getPageSource().contains("CURA Healthcare")){
            System.out.println("Test case is Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test case is failed");
            Assert.fail();
        }

    }
}
