package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium30_Modals {

    @Test
    public void test_Modals() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        closeModal.click();

        WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait_2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"minimize\"]")));

        WebElement closeModal_2 = driver.findElement(By.xpath("//img[@alt=\"minimize\"]"));
        closeModal_2.click();

    }
}
