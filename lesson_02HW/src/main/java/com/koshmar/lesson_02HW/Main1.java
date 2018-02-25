package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        //Инициализация ChromeDriver
        WebDriver driver = initChromeDriver();

        Thread thread = new Thread();

        //Настройка ChromeDriver
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Авторизация на сайте
        WebElement fieldLogin = driver.findElement(By.id("email"));
        fieldLogin.sendKeys("webinar.test@gmail.com");
        WebElement fieldPass = driver.findElement(By.id("passwd"));
        fieldPass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();

        //
        WebElement dashBoard = driver.findElement(By.id("tab-AdminDashboard"));
        dashBoard.click();
        WebElement dash = driver.findElement(By.linkText("Dashboard"));
        System.out.println(dash.getText());
        driver.navigate().refresh();
        Thread.sleep(5000);
        WebElement dash1 = driver.findElement(By.linkText("Dashboard"));
        if (dash.equals(dash1)){
            System.out.println("Пользователь остается в разделе Dashboard");
        } else {
            System.out.println("Пользователь не остается в разделе Dashboard");
        }

        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        WebElement ord = driver.findElement(By.linkText("Заказы"));
        System.out.println(ord.getText());
        driver.navigate().refresh();
        Thread.sleep(5000);
        WebElement ord1 = driver.findElement(By.linkText("Заказы"));
        if (ord.equals(ord1)){
            System.out.println("Пользователь остается в разделе Заказы");
        } else {
            System.out.println("Пользователь не остается в разделе Заказы");
        }






//        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
//        orders.click();
//        System.out.println("Заказы");

//        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));
//        catalog.click();
//
//        WebElement parentCustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
//        parentCustomer.click();
//
//        WebElement parentCustomerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
//        parentCustomerThreads.click();
//
//        WebElement stats = driver.findElement(By.id("subtab-AdminStats"));
//        stats.click();
//
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






//        WebElement ord = driver.findElement(By.partialLinkText("AdminDashboard&token=f57b9e0913a4757c6ba02314cf473896"));
//        System.out.println(ord.getText());

//        String ord = driver.findElement(By);

//        List<WebElement> refers =driver.findElements(By.tagName("b_algo"));
//        System.out.println(refers.size());


//        driver.quit();

    }

    private static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }

//    private static Thread initThread (){
//
//    }
}
