package com.koshmar.lesson_03HW.util;


public class Properties {
    private final static String DEFAULT_BROWSER = "browser";

    public static String getDefaultBrowser (String browserName){
        return System.getProperty(DEFAULT_BROWSER,browserName);
    }

}
