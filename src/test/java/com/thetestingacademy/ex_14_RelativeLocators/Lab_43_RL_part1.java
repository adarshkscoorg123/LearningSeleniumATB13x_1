package com.thetestingacademy.ex_14_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab_43_RL_part1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[contains(text(),\"Years of\")]"));

        driver.findElement(with(By.xpath("//input[@id=\"exp-4\"]")).toRightOf(span_element)).click();

        WebElement gender = driver.findElement(By.xpath("//b[text()=\"Gender\"]"));
        //input[@id="sex-1"]
        driver.findElement(with(By.xpath("//input[@id=\"sex-1\"]")).toRightOf(gender)).click();

        WebElement firstname = driver.findElement(By.xpath("//span[text()=\"First name:\"]"));

        driver.findElement(with(By.xpath("//input[@name=\"firstname\"]")).toRightOf(firstname)).sendKeys("Adarsh");

        WebElement tools_element = driver.findElement(By.xpath("//span[text()=\"Automation Tools\"]"));

        driver.findElement(with(By.id("tool-2")).toRightOf(tools_element)).click();

        WebElement Automation_tester = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));

        driver.findElement(with(By.xpath("//input[@id=\"profession-0\"]")).toLeftOf(Automation_tester)).click();

        Thread.sleep(5000);

        WebElement span_element_1 = driver.findElement(By.xpath("//input[@id=\"exp-6\"]"));
        driver.findElement(with(By.xpath("//input[@id=\"exp-3\"]")).toLeftOf(span_element_1)).click();
    }
}
