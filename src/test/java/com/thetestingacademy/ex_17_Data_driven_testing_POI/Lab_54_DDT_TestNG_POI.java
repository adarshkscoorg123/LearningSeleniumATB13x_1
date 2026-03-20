package com.thetestingacademy.ex_17_Data_driven_testing_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_54_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username, String password){
        System.out.println("Running");
        System.out.println(username + "-" + password);
    }

    @DataProvider
    public Object[][] getData() {
        // Read  from the Excel file
        // Convert this into the 2d array Object
        // return that array
        return UtilExcel.getTestDataFromExcel("Sheet1");
    };
}
