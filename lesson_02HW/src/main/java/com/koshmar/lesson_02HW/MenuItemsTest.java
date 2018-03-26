package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
            i.getAttribute("href");

            //            int x = i.getLocation().getX();
//            int y = i.getLocation().getY();
//            Actions actions = new Actions(driver);
//            actions.moveToElement(i, x, y).click().build().perform();

            //            System.out.println(driver==null);
//            i.click();
//            driver.findElement(By.tagName(i.getTagName())).click();
//            System.out.println("wdqw");
//
////            clickOnCategoriesTabs(i);
////            System.out.println(i.getText());
//            Thread.sleep(3000);
        }
    }
    public void clickOnCategoriesTabs(WebElement nameOfCategoria) throws InterruptedException {
        nameOfCategoria.click();
        Thread.sleep(3000);
        WebElement elementBeforeRefresh = driver.findElement(By.className("page-title"));
        String elemBeforeRefresh = elementBeforeRefresh.getText();
        System.out.println(elemBeforeRefresh);
        driver.navigate().refresh();
        WebElement elementAfterRefresh = driver.findElement(By.className("page-title"));
        String elemAfterRefresh = elementAfterRefresh.getText();
        System.out.println("Пользователь находится в разделе: " + elemAfterRefresh);

    }
//    public void refreshPage (){
//        driver.navigate().refresh();
//    }
//    public void repeatListOfElements() throws InterruptedException{
//        List<WebElement> allCategories = driver.findElements(mySelector);
//        System.out.println("Обновленный список разделов главного меню:");
//        for (WebElement i : allCategories){
//            System.out.println(i.getText());
//            Thread.sleep(1);
//        }
//    }
}

