package com.thetestingacademy.ex_16_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Lab_OrangeHRM {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://adarshkssuresh-trials80.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id = \"txtUsername\"]"));
        userName.sendKeys("admin");

        //input[@id = "txtPassword"]

        WebElement password = driver.findElement(By.xpath("//input[@id = \"txtPassword\"]"));
        password.sendKeys("oN07dG@QqV");

        //button[text() ="Login"]

        WebElement login_button = driver.findElement(By.xpath("//button[text() =\"Login\"]"));
        login_button.click();

        Thread.sleep(5000);
        //login_button.submit();

        //a[normalize-space()="Employee List"]

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()=\"Employee List\"]")));


        WebElement employeeList = driver.findElement(By.xpath("//a[normalize-space()=\"Employee List\"]"));
        employeeList.click();

        Thread.sleep(10000);

        //table[@id ="employeeListTable"]-'Table'
        //table[@id ="employeeListTable"]/tbody- Table body

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id =\"employeeListTable\"]/tbody")));

        WebElement table = driver.findElement(By.xpath("//table[@id =\"employeeListTable\"]/tbody"));

        //table[@id ="employeeListTable"]/tbody/tr[2]/td- THis is the full path we need
        // So split the above expression

        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));
        System.out.println(rows_tables.size());

        for(int i=0; i<rows_tables.size(); i++){
            List<WebElement> columns = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c : columns){
                System.out.println(c.getText());
            }
        }

        //span[text()="Log Out"]

        Thread.sleep(4000);

        //WebElement logOut = driver.findElement(By.xpath("//span[text()=\"Log Out\"]"));
        //logOut.click();

    }

}
