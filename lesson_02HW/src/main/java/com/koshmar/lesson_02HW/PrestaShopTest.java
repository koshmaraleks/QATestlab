package com.koshmar.lesson_02HW;

public class PrestaShopTest extends ChromeSettings {
    public void script1() throws InterruptedException {
        Main main = new Main(driver);
        main.typeEmail(userEmail);
        main.typePass(userPassword);

    }
}
