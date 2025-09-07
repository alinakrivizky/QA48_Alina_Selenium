package com.shop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
  WebDriver driver;

  UserHelper user;
  ItemHelper item;
  HomePageHelper home;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        user=new UserHelper(driver);
        item=new ItemHelper(driver);
        home=new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }

    public HomePageHelper getHome() {
        return home;
    }

}
