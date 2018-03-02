package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import java.util.List;

public class MenuItemsTest {
    private WebDriver driver;

    public MenuItemsTest(WebDriver driver) {
        this.driver = driver;
    }

    public void listOfElements() throws InterruptedException {
        List<WebElement> allCategories = driver.findElements(By.className("maintab"));
        Iterator<WebElement> itr = allCategories.iterator();
        System.out.println("Список разделов главного меню:");
        while(itr.hasNext()) {
            System.out.println(itr.next().getText());

//            Thread.sleep(3);

        }
    }
//    public void refreshPage (){
//        driver.navigate().refresh();
//    }
//    public void repeatListOfElements(){
//        List<WebElement> allCategories = driver.findElements(By.className("maintab"));
//        Iterator<WebElement> itr = allCategories.iterator();
//        System.out.println("Список разделов главного меню после перезагрузки:");
//        while(itr.hasNext()) {
//            System.out.println(itr.next().getText());
//        }
//    }
}

