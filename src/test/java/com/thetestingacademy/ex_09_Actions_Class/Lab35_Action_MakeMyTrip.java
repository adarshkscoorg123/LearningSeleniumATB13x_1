package com.thetestingacademy.ex_09_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab35_Action_MakeMyTrip {


    @Test
    public void test_actions_MakeMyTrip() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        closeModal.click();

        WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait_2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"minimize\"]")));

        WebElement closeModal_2 = driver.findElement(By.xpath("//img[@alt=\"minimize\"]"));
        closeModal_2.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@id=\"toCity\"]"));

        //WebElement modal_2 = driver.findElement(By.xpath("//span[@data-cy=\"travel-card-close\"]"));
        Actions actions = new Actions(driver);

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"fromCity\"]")));

        actions.moveToElement(fromCity).click().sendKeys("Shirdi").build().perform();

        Thread.sleep(4000);

        //ul[@class="react-autosuggest__suggestions-list"]/li

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e:list_auto_complete){
            if(e.getText().contains("SAG")){
                e.click();
            }
        }

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"toCity\"]")));

        actions.moveToElement(toCity).click(toCity).sendKeys("Mangalore").build().perform();

        Thread.sleep(4000);

        List<WebElement> list_auto_complete_2 = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

       try {
           for (WebElement e1 :list_auto_complete_2){
               if(e1.getText().contains("IXE")){
                   e1.click();
                }
            }
       } catch (Exception e1) {
           e1.printStackTrace();
        }
    }
}
