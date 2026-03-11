package com.thetestingacademy.ex_16_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_50_WebTables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        // exapmple for 3rd row, 3rd column
        // table[@id="customers"]/tbody/tr[3]/td[3]

        //table[@id="customers"]/tbody/tr

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td")).size();

        for (int i=2;i<=row;i++) { //rows
            for (int j = 1; j <= col; j++) { // columns
                String dynamic_path = first_part + i + second_part + j + third_part;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);

                if(data.contains("Maria Anders")){
                    String country_path = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("----------");
                    System.out.println("Maria Anders is in - "+ country_text);
                }


            }
        }

    }
}
