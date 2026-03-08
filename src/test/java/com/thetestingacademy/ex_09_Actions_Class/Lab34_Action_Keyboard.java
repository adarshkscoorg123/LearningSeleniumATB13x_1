package com.thetestingacademy.ex_09_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab34_Action_Keyboard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));
        //firstName.sendKeys("Adarsh");

        WebElement lastName = driver.findElement(By.name("lastname"));
        //lastName.sendKeys("Suresh");

        Actions actions = new Actions(driver);

        //actions.moveToElement(firstName).click().sendKeys("THE TESTING ACADEMY").build().perform();
        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"The testing Academy").keyUp(Keys.SHIFT).build().perform();

        actions.moveToElement(lastName).click().sendKeys("Pramod").build().perform();

        Thread.sleep(4000);

        driver.quit();


    }
}
