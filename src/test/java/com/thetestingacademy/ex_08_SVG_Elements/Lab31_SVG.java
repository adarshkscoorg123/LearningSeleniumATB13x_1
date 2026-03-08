package com.thetestingacademy.ex_08_SVG_Elements;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class Lab31_SVG extends CommonToAll {


    @Test
    public void test_Flipkart_Search_ICON() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/search");

        //input[@name="q"]

        WebElement search_input= driver.findElement(By.xpath("//input[@name=\"q\"]"));
        search_input.sendKeys("macmini");

        Thread.sleep(4000);

        //Finding SVG
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();
        //svgElements.get(8).click(); it Will open "Home&furniture"

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));

        for (WebElement title: titleResults){
            System.out.println(title.getText());
        }

        //Until Next button is visible
        WebElement next_button = driver.findElement(By.xpath("//span[text()=\"Next\"]"));
        while(next_button.isDisplayed()){
            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()=\"2\"]"));
            next_button_page2.click();
        }

        List<WebElement> titleResults_2 = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));

        for (WebElement title: titleResults_2){
            System.out.println(title.getText());
        }

    }


}
