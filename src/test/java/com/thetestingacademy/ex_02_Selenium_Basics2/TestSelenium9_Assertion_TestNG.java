package com.thetestingacademy.ex_02_Selenium_Basics2;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium9_Assertion_TestNG {

    @Description("Verify that the title is visible")
    @Test
    public void test_Selenium_Assertions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.capgemini.com/in-en/careers");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //Assert function from TESTNG

        //https://www.capgemini.com/in-en/careers/?page=1&size=11&country_code=in-en
        //Capgemini Careers & Job Openings | Capgemini India

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.capgemini.com/in-en/careers/?page=1&size=11&country_code=in-en");
        Assert.assertEquals(driver.getTitle(),"Capgemini Careers & Job Openings | Capgemini India");

        //AssertJ

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.capgemini.com/in-en/careers/?page=1&size=11&country_code=in-en");
        assertThat(driver.getTitle()).isEqualTo("Capgemini Careers & Job Openings | Capgemini India").isNotBlank().isNotNull();

        driver.quit();
    }
}
