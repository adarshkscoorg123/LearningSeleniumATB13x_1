package com.thetestingacademy.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_ID_Classname_etc {

    @Description("TC#1-Verify that with invalid login,error message is displayed")
    @Owner("Pramod Dutta")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //1.Find the email id and enter the admin@admin.com
        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0">
        // Close tag

        WebElement email_input = driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
        email_input.sendKeys("admin@admin.com");

        //2.Find the password inputbox and enter the password
        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">
        // close the tag

        WebElement password_input= driver.findElement(By.name("password"));
        password_input.sendKeys("12345");

        //span[@class="checkbox-radio-button ng-scope"]

        WebElement remember_me = driver.findElement(By.xpath("//span[@class=\"checkbox-radio-button ng-scope\"]"));
        remember_me.click();

        //3. Find the Submit button and click on it
        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)" data-qa="sibequkica">

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        //4.Wait for some time
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //5. verify the error message
        // class="notification-box-description"
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        //6.Use TestNg to assert
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.quit();

    }
}
