package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuItemsTest {
    private WebDriver driver;
    private By

    public MenuItemsTest(WebDriver driver) {
        this.driver = driver;
    }
    public void listOfElements(){
        List<WebElement> menuItems =driver.findElements(By.className("maintab"));
        System.out.println(menuItems.);
    }
}
