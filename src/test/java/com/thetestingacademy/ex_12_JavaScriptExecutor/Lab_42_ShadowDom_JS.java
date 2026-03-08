package com.thetestingacademy.ex_12_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_42_ShadowDom_JS {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //driver.findElement(By.id("pizza")).sendKeys("farmhouse");

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")");
        inputboxPizza.sendKeys("Dominoz_pizza");

        Thread.sleep(10000);

        WebElement userName = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\")");
        userName.sendKeys("Sairam");

        //document.querySelector("div#userName").shadowRoot.querySelector("div#concepts").shadowRoot.querySelector("#training")
        //document.querySelector("div#userPass").shadowRoot.querySelector("input#pwd")
        // We cannot access the above shadowRoots since both the above examples are  in "closed" state. It has to be (Shadow-root- "open")





    }
}
