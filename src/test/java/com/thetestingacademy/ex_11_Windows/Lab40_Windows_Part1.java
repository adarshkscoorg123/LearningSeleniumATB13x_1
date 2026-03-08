package com.thetestingacademy.ex_11_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab40_Windows_Part1 {

    @Test
    public void test_windows() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        //System.out.println(driver);

        Thread.sleep(4000);

        //a[text()="Click Here"]
        //a[contains(text(),"Click Here")]

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]"));
        clickHere.click();

        Set<String> window_handles_id = driver.getWindowHandles();
        System.out.println(window_handles_id);
        System.out.println(window_handles_id.size());

        //How do I switch to a child window and verify that there is a
        //text with the name of the new window?

        for(String window: window_handles_id){
            driver.switchTo().window(window);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test case is passed");
            }
        }

        Thread.sleep(4000);

        driver.switchTo().window(parent_id);
    }

}
