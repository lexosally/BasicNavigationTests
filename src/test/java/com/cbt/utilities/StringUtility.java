package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(){

        String expected = "https://google.com/";
        String actual = "";


        if (actual.equals(expected)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }
}
