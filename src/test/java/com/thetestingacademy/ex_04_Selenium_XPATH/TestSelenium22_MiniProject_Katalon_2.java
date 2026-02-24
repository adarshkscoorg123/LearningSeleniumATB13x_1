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
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium22_MiniProject_Katalon_2 extends CommonToAll {


    @Owner("Adarsh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify with valid email, password, appointment")

    @Test
    public void test_Katalon_login_usingList(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_button= driver.findElement(By.xpath("//a[contains(text(),\"Make Appointment\")]"));
        make_appointment_button.click();

        //input[@placeholder="Username"]
        List<WebElement> username_input = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username_input.get(1).sendKeys("John Doe");


        //input[@placeholder="Password"]
        List<WebElement> password_inputbox = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        password_inputbox.get(1).sendKeys("ThisIsNotAPassword");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement login_button = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
        login_button.click();
    }
}
