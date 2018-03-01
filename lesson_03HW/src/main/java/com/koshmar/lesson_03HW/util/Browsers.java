package com.koshmar.lesson_03HW.util;

public enum Browsers {
    CHROME ("chrome"), FIREFOX ("firefox"), INTERNET_EXPLORER ("internet explorer");
    private String browserName;

    Browsers(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }
}
