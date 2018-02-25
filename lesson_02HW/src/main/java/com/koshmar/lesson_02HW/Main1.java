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

        //Поиск и клик на элементе Dashboard
        WebElement dashBoard = driver.findElement(By.id("tab-AdminDashboard"));
        dashBoard.click();
        //Вывод названия элемента в консоль
        WebElement dash = driver.findElement(By.linkText("Dashboard"));
        String stringDash = dash.getText();
        System.out.println(stringDash);
        //Перезагрузка страницы
        driver.navigate().refresh();
        //Создание переменной для хранения названия раздела после перезагрузки
        WebElement dash1 = driver.findElement(By.linkText("Dashboard"));
        String stringDash1 = dash1.getText();
        //Сравнение и вывод результата в консоль
        if (stringDash.equals(stringDash1)){
            System.out.println("Пользователь остается в разделе Dashboard");
        } else {
            System.out.println("Пользователь не остается в разделе Dashboard");
        }

        //Поиск и клик на элементе orders
        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        //Вывод названия элемента в консоль
        WebElement ord = driver.findElement(By.linkText("Заказы"));
        String stringOrd = ord.getText();
        System.out.println(stringOrd);
        //Перезагрузка страницы
        driver.navigate().refresh();
        //Создание переменной для хранения названия раздела после перезагрузки
        WebElement ord1 = driver.findElement(By.linkText("Заказы"));
        String stringOrd1 = ord1.getText();
        //Сравнение и вывод результата в консоль
        if (stringOrd.equals(stringOrd1)){
            System.out.println("Пользователь остается в разделе Заказы");
        } else {
            System.out.println("Пользователь не остается в разделе Заказы");
        }

//        //Поиск и клик на элементе catalog
//        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));
//        catalog.click();
//        //Вывод названия элемента в консоль
//        WebElement cat = driver.findElement(By.linkText("Каталог"));
//        String stringCat = cat.getText();
//        System.out.println(stringCat);
//        //Перезагрузка страницы
//        driver.navigate().refresh();
////        Thread.sleep(3000);
//        //Создание переменной для хранения названия раздела после перезагрузки
//        WebElement cat1 = driver.findElement(By.linkText("Каталог"));
//        String stringCat1 = cat1.getText();
//        //Сравнение и вывод результата в консоль
//        if (stringCat.equals(stringCat1)){
//            System.out.println("Пользователь остается в разделе Каталог");
//        } else {
//            System.out.println("Пользователь не остается в разделе Каталог");
//        }

        //Поиск и клик на элементе customer
        WebElement parentCustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
        parentCustomer.click();
        //Вывод названия элемента в консоль
        WebElement cust = driver.findElement(By.linkText("Клиенты"));
        String stringCustomer = cust.getText();
        System.out.println(stringCustomer);
        //Перезагрузка страницы
        driver.navigate().refresh();
        //Создание переменной для хранения названия раздела после перезагрузки
        WebElement cust1 = driver.findElement(By.linkText("Клиенты"));
        String stringCustomer1 = cust1.getText();
        //Сравнение и вывод результата в консоль
        if (stringCustomer.equals(stringCustomer1)){
            System.out.println("Пользователь остается в разделе Клиенты");
        } else {
            System.out.println("Пользователь не остается в разделе Клиенты");
        }

        //Поиск и клик на элементе customer service
        WebElement parentCustomerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        parentCustomerThreads.click();
        //Вывод названия элемента в консоль
        WebElement custServ = driver.findElement(By.linkText("Служба поддержки"));
        String stringCustomerService = custServ.getText();
        System.out.println(stringCustomerService);
        //Перезагрузка страницы
        driver.navigate().refresh();
        //Создание переменной для хранения названия раздела после перезагрузки
        WebElement custServ1 = driver.findElement(By.linkText("Служба поддержки"));
        String stringCustomerService1 = custServ1.getText();
        //Сравнение и вывод результата в консоль
        if (stringCustomerService.equals(stringCustomerService1)){
            System.out.println("Пользователь остается в разделе Служба поддержки");
        } else {
            System.out.println("Пользователь не остается в разделе Служба поддержки");
        }

        //Поиск и клик на элементе customer
        WebElement stats = driver.findElement(By.id("subtab-AdminStats"));
        stats.click();
        //Вывод названия элемента в консоль
        WebElement stat = driver.findElement(By.linkText("Статистика"));
        String stringStat = stat.getText();
        System.out.println(stringStat);
        //Перезагрузка страницы
        driver.navigate().refresh();
        //Создание переменной для хранения названия раздела после перезагрузки
        WebElement stat1 = driver.findElement(By.linkText("Статистика"));
        String stringStat1 = stat1.getText();
        //Сравнение и вывод результата в консоль
        if (stringStat.equals(stringStat1)){
            System.out.println("Пользователь остается в разделе Статистика");
        } else {
            System.out.println("Пользователь не остается в разделе Статистика");
        }

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

        driver.quit();

    }

    private static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}
