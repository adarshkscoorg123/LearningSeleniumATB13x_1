package com.thetestingacademy.ex_09_Actions_Class;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab33_ActionClass extends CommonToAll {

    @Test
    public void test_actions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        //div[text()="round trip"]

        WebElement radio = driver.findElement(By.xpath("//div[text()=\"round trip\"]"));
        radio.click();

        //div[@data-testid="to-testID-origin"]/div/div[2]/input

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div[2]/input"));

        //div[@data-testid="to-testID-destination"]/div/div[2]/input

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div[2]/input"));

        Actions actions = new Actions(driver);
        // move to element
        //click
        //sendkeys-BLR

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        actions.moveToElement(destination).click().sendKeys("Ahm").build().perform();

        actions.contextClick(source).build().perform();

        //actions.doubleClick();
        //actions.clickAndHold();
        //actions.dragAndDrop(source,destination).build().perform();
    }
}
