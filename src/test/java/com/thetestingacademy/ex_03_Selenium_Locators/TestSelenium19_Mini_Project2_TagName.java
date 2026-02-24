package com.thetestingacademy.ex_03_Selenium_Locators;

import com.thetestingacademy.Utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TestSelenium19_Mini_Project2_TagName extends CommonToAll {

    @Owner("Adarsh")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that the error message comes with invalid email on signup")
    @Test
    public void vwo_free_trial_error_verify() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        WebElement anchorTag_fullLinktext_match = findElementByLinkText(driver,"Start a free trial");
        anchorTag_fullLinktext_match.click();

        Thread.sleep(4000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindowHandle);

        Set<String> allWindowHandles = driver.getWindowHandles();
        // 4. Iterate through the handles and switch to the child window
        for (String handle : allWindowHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("campaign"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"page-v1-step1-email\"]")));

        //input[@id="page-v1-step1-email"]
        WebElement email= driver.findElement(By.xpath("//input[@id=\"page-v1-step1-email\"]"));
        email.sendKeys("abc");

        WebElement buttonDisabled = driver.findElement(By.xpath("//button[contains(text(),\"Create a Free Trial Account\")]"));
        System.out.println(buttonDisabled.isEnabled());

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        System.out.println(checkbox_policy.isSelected());

        checkbox_policy.click();
        System.out.println(checkbox_policy.isSelected());
        System.out.println("------------");

        Thread.sleep(2000);

        //button[text()="Create a Free Trial Account"]

        WebElement button = driver.findElement(By.xpath("//button[text()=\"Create a Free Trial Account\"]"));
        button.click();

        //div[contains(text(),"The email address you entered is incorrect")]

        WebElement error_message = driver.findElement(By.xpath("//div[contains(text(),\"The email address you entered is incorrect\")]"));
        System.out.println(error_message.isDisplayed());
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        closebrowser(driver);

    }
}
