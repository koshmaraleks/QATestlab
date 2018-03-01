package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main1 {
    public static void main(String[] args) {
        ChromeSettings chromeSettings = new ChromeSettings();
        SignIn signIn = new SignIn(chromeSettings);
        WebDriver driver = signIn.getDriver();
        signIn.login();



//        WebElement parentModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
//        parentModulesSf.click();
//
//        WebElement parentThemes = driver.findElement(By.id("subtab-AdminParentThemes"));
//        parentThemes.click();
//
//        WebElement parentShipping = driver.findElement(By.id("subtab-AdminParentShipping"));
//        parentShipping.click();
//
//        WebElement parentPayment = driver.findElement(By.id("subtab-AdminParentPayment"));
//        parentPayment.click();
//
//        WebElement international = driver.findElement(By.id("subtab-AdminInternational"));
//        international.click();
//
//        WebElement parameters = driver.findElement(By.id("subtab-ShopParameters"));
//        parameters.click();
//
//        WebElement advancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
//        advancedParameters.click();

//        driver.quit();

    }
}
