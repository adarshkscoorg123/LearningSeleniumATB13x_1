package com.thetestingacademy.ex_16_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Lab_51_WebTables_Ex2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        //table[@summary="Sample Table"]- 'Table'
        //table[@summary="Sample Table"]/tbody - Table body

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        // Rows and columns

        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

        System.out.println(rows_tables.size());

        for(int i=0; i<rows_tables.size(); i++){
            List<WebElement> columns = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c : columns){
                System.out.println(c.getText());
            }
        }


    }
}
