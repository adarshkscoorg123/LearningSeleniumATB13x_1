package com.thetestingacademy.ex_17_Data_driven_testing_POI;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab_55_DDT_TestNG_POI_Real extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password){

            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://app.vwo.com");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());

            Assert.assertEquals(driver.getTitle(),"Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

            WebElement email_inputBox = driver.findElement(By.id("login-username"));
            email_inputBox.sendKeys(email);

            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys(password);

            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

            WebElement error_message = driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        }

    @DataProvider
    public Object[][] getData(){
        // Read  from the Excel file
        // convert this into the 2d array Object
        // return that in 2d array
        return UtilExcel.getTestDataFromExcel("sheet1");
    };
}
