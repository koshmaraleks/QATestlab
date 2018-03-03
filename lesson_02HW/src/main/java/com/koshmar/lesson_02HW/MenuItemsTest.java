package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MenuItemsTest {
    private WebDriver driver;
    private By mySelector = By.className("maintab");

    public MenuItemsTest(WebDriver driver) {
        this.driver = driver;
    }
    public void listOfElements() throws InterruptedException {
        List<WebElement> allCategories = driver.findElements(mySelector);
        System.out.println("Список разделов главного меню:");
        for (WebElement i : allCategories){
            System.out.println(i.getText());
            Thread.sleep(1);
        }
    }
    public void refreshPage (){
        driver.navigate().refresh();
    }
    public void repeatListOfElements() throws InterruptedException{
        List<WebElement> allCategories = driver.findElements(mySelector);
        System.out.println("Обновленный список разделов главного меню:");
        for (WebElement i : allCategories){
            System.out.println(i.getText());
            Thread.sleep(1);
        }
    }
}

