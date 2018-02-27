package com.koshmar.lesson_02HW;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIn {
    private ChromeSettings chromeSettings;

    public SignIn(ChromeSettings chromeSettings) {
        this.chromeSettings = chromeSettings;
    }
    public ChromeDriver setUp (){
        driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
