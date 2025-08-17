package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkSecondSeleniumTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");//without history
        //driver.navigate().to("https://demowebshop.tricentis.com/");//with history
    }
    @Test
    public void openShop(){
        System.out.println("Shop page is opened");
    }
}
