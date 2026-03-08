package com.thetestingacademy.ex_09_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab37_Action_Drag_and_Drop {

    public static void main(String[] args) throws InterruptedException {

        //div[@id="column-a"]
        //div[@id="column-b"]

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        // Source
        // Destination

        WebElement from_Drag = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement to_Drop = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));

        actions.dragAndDrop(from_Drag,to_Drop).build().perform();


        Thread.sleep(4000);

        driver.quit();
    }
}
