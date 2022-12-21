package org.example;

import config.BaseClass;

import static config.BaseClass.driver;
import static java.lang.Thread.*;

public class Main  extends BaseClass {
    
    public static void main(String[] args) {
              driver.manage().window().maximize();
              driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.quit();

        driver.quit();
    }
}