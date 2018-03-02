package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {
    private WebDriver driver;
    private By userPictogram = By.id("header_employee_box");
    private By userLogout = By.id("header_logout");

    public SignOut(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnUserPictogram() {
        driver.findElement(userPictogram).click();
    }
    public void clickOnSignOutBtn () {
        driver.findElement(userLogout).click();
    }

}
