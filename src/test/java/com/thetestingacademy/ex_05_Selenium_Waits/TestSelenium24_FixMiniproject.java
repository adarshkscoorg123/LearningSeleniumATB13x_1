package com.thetestingacademy.ex_05_Selenium_Waits;

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

public class TestSelenium24_FixMiniproject {

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

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        //2.Find the password inputbox and enter the password
        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">
        // close the tag

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");

        //3. Find the Submit button and click on it
        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)" data-qa="sibequkica">

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        //4.Wait for some time
        //try {
        //hread.sleep(4000);
        // } catch (InterruptedException e) {
        // throw new RuntimeException(e);
        //}

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Two things in Explicit Wait
        //1. First max time duration-ex:10 seconds-Duration.ofSeconds(10)
        //2. Condition ? ExpectedConditions.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


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

        driver.quit();

    }
}
