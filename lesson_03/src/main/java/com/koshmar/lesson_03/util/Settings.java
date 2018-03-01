package com.koshmar.lesson_03.util;

import org.openqa.selenium.remote.BrowserType;

public enum Settings {
    BASE_URL ("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//    DEFAULT_BROWSER (BrowserType.CHROME);


    private String value;

    Settings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}