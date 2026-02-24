package com.thetestingacademy.ex_04_Selenium_XPATH;

import com.thetestingacademy.Utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium20_MiniProject_OrangeHRM extends CommonToAll {

    @Owner("Adarsh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_Login(){

        //https://adarshks-trials719.orangehrmlive.com/auth/seamlessLogin
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://adarshks-trials719.orangehrmlive.com/auth/seamlessLogin");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //input[@name="txtUsername"] // admin
        //input[@id="txtPassword"]   // J8Oqg@G6iY
        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"txtUsername\"]"));
        WebElement input_password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));

        //button[normalize-space()="Login"]
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        input_username.sendKeys("Admin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        input_password.sendKeys("J8Oqg@G6iY");
        button.click();

        //Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Employee Management\"]")));

        //div[normalize-space()="Employee Management"]

        WebElement EmpMan = driver.findElement(By.xpath("//div[normalize-space()=\"Employee Management\"]"));
        Assert.assertEquals(EmpMan.getText(),"Employee Management");

        closebrowser(driver);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        //Two things in Explicit Wait
        //1. First max time duration-ex:4 seconds-Duration.ofSeconds(4)
        //2. Condition ? ExpectedConditions.
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Employee Management\"]")));

    }
}
