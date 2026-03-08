package com.thetestingacademy.ex_14_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab_45_RL_part3 {

    @Test
    public void test_relative_locator_aqi() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        //input[contains(@placeholder,"Search any Location")]
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("india" + Keys.ENTER);

        //div[contains(@class,"location-name")]/p
        // List of Elements

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
        for (WebElement element : locations){
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(element)).getText();
            String status = driver.findElement(with(By.xpath("//div[contains(@class, \"aqi-status\")]")).toRightOf(element)).getText();
            System.out.println("| +" +rank + " | " + element.getText() + "| " +aqi+ "|" + "| " +status+ "|");
        }

    }
}
