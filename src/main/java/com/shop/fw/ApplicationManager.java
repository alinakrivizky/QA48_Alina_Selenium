package com.shop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ApplicationManager {
    String browser;
    WebDriver driver;

  UserHelper user;
  ItemHelper item;
  HomePageHelper home;

    public ApplicationManager(String browser) {
        this.browser=browser;
    }

    public void init() {
        if(browser.equalsIgnoreCase("chrome")) {
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("safari")) {
            driver=new SafariDriver();
        }
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
