package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium27_Alerts extends CommonToAll {

    @Test
    public void test_alerts() throws InterruptedException {

        //button[contains(text(),"Click for JS Alert")]
        //button[text()="Click for JS Confirm"]
        //button[normalize-space()="Click for JS Prompt"]
        //p[@id="result"]

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        Thread.sleep(4000);

        WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]"));
        jsAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement text= driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String result = text.getText();
        System.out.println(result);

        Assert.assertEquals(result,"You successfully clicked an alert");


    }


}
