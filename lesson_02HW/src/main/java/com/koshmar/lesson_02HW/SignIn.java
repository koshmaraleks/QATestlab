package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIn {
    private ChromeSettings chromeSettings;
    private WebDriver driver;
    private static final String USER_NAME = "webinar.test@gmail.com";
    private static final String USER_PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    public SignIn(ChromeSettings chromeSettings) {
        this.chromeSettings = chromeSettings;
    }
    private ChromeDriver setUp (){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void login (){
        this.driver = this.chromeSettings.initChromeDriver();
        this.setUp();
        this.typeEmail();
        this.typePass();
        this.clickButton();
    }

    private void typeEmail() {
        WebElement fieldLogin = driver.findElement(By.id("email"));
        fieldLogin.click();
        fieldLogin.clear();
        fieldLogin.sendKeys(USER_NAME);
    }

    private void typePass() {
        WebElement fieldPass = driver.findElement(By.id("passwd"));
        fieldPass.click();
        fieldPass.clear();
        fieldPass.sendKeys(USER_PASSWORD);
    }

    private void clickButton() {
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();
    }
}
