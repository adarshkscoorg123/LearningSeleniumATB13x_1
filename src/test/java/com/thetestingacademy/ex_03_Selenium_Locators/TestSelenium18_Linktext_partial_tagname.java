package com.thetestingacademy.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_Linktext_partial_tagname {

    @Description("Verify vwo")
    @Test
    public void test_login_vwo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // <a href="https://vwo.com/free-trial/?utm_medium=website&amp;
        // utm_source=login-page&amp;
        // utm_campaign=mof_eg_loginpage"
        // class="text-link
        // Td(n)" data-qa="bericafeqo">Start a free trial</a>

        //Link text-Full text match

        // We can use either linktext or partialLinkText to identify link elements

        //WebElement anchorTag_fullLinktext_match= driver.findElement(By.linkText("Start a free trial"));
        //anchorTag_fullLinktext_match.click();

        WebElement anchorTag_partialLinktext_match = driver.findElement(By.partialLinkText("free"));
        anchorTag_partialLinktext_match.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    }
