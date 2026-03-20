package com.thetestingacademy.ex_17_Data_driven_testing_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_53_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username, String password, String ER){
        System.out.println("Running");
        System.out.println(username + "-" + password + "-" + ER);
    }

    @DataProvider
    public Object[][] getData(){
        // Read  from the Excel file
        // Convert this into the 2d array Object
        // Return that array
        return null;
    };
}
