package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;

public class ScriptA extends ChromeSettings{
    public static void main(String[] args) {
        WebDriver driver = getConfiguredDriver();
        SignIn signIn = new SignIn(driver);
        SignOut signOut = new SignOut(driver);

        signIn.open();
        signIn.fillEmailInput();
        signIn.fillPasswordInput();
        signIn.clickSubmitButton();

//        signOut.clickOnUserPictogram();
//        signOut.clickOnSignOutBtn();
//
//        quitDriver(driver);
    }
}
