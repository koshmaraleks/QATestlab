package com.koshmar.lesson_02HW.util;

import org.openqa.selenium.remote.BrowserType;


public class Properties {
    private static final String BROWSER = BrowserType.CHROME;
    private static final String BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

    public static String getBaseAdminUrl(){
        return System.getProperty(BASE_ADMIN_URL);
    }

    public static String getBrowser (){
        return System.getProperty(BROWSER);
    }
}

//enum EnvironmentVariables{
//
//}