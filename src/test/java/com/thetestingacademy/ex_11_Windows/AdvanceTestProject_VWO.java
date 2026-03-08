package com.thetestingacademy.ex_11_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class AdvanceTestProject_VWO {

    @Test
    public void test_interview_vwo_projects() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap?accountId=1134591");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //input[@name="primaryUrl"]

        WebElement url_input = driver.findElement(By.xpath("//input[@name=\"primaryUrl\"]"));
        url_input.clear();
        url_input.sendKeys("https://thetestingacademy.com/");

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " +parentWindowHandle);

        WebElement view_heatmap = driver.findElement(By.xpath("//button[contains(text(),\"View Heatmap\")]"));
        view_heatmap.click();

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);

        for (String handle: allHandles){
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");

                //span[text()="Compare"]
                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));

                Actions actions = new Actions(driver);
                actions.moveToElement(navigate_button).click().build().perform();
            }
        }
    }
}
