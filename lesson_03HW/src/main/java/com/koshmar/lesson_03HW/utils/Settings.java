package com.koshmar.lesson_03HW.utils;

public enum Settings {
    BASE_URL ("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

    private String value;

    Settings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}