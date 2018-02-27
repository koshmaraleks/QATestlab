package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Main {

    private WebDriver driver;


    public Main(WebDriver driver) {
        this.driver = driver;
    }

    By emailInputLocator = By.id("email");
    By passwordInputLocator = By.id("passwd");
    By signInButtonLocator = By.name("submitLogin");

    public void typeEmail(String email) {
        WebElement fieldLogin = driver.findElement(emailInputLocator);
        fieldLogin.click();
        fieldLogin.clear();
        fieldLogin.sendKeys(email);
    }

    public void typePass(String password) {
        WebElement fieldPass = driver.findElement(passwordInputLocator);
        fieldPass.click();
        fieldPass.clear();
        fieldPass.sendKeys(password);
    }

}


//    public static void main(String[] args) {
//        WebDriver driver = initChromeDriver();
//
//
//        WebElement fieldLogin = driver.findElement(By.id("email"));
//        fieldLogin.sendKeys("webinar.test@gmail.com");
//
//        WebElement fieldPass = driver.findElement(By.id("passwd"));
//        fieldPass.sendKeys("Xcg7299bnSmMuRLp9ITw");
//
//        WebElement button = driver.findElement(By.name("submitLogin"));
//        button.click();
//
//        WebElement userPictogram = driver.findElement(By.id("header_employee_box"));
//        userPictogram.click();
//
//        WebElement userLogout = driver.findElement(By.id("header_logout"));
//        userLogout.click();
//
//        driver.quit();





