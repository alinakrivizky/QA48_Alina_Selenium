package com.shop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isElementPresent() {
        return isElementPresent(By.cssSelector(
                "div:nth-child(1)>div:nth-child(3)>ul:nth-child(1)>li:nth-child(1)>a:nth-child(1)"
        ));
    }
}
