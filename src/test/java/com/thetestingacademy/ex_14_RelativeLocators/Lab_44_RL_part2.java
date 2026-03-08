package com.thetestingacademy.ex_14_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab_44_RL_part2 {

    @Test
    public void test_relative_locator_codeOpen(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        WebElement button = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
        button.click();

        WebElement userName = driver.findElement(By.id("username"));
        WebElement error_message = driver.findElement(with(By.tagName("small")).below(userName));
        System.out.println(error_message.getText());

        WebElement email_errorMessage = driver.findElement(By.xpath("//small[contains(text(),\"Email is not\")]"));
        WebElement email = driver.findElement(with(By.id("email")).above(email_errorMessage));

        email.sendKeys("adarshkssuresh263@gmail.com");

    }
}
