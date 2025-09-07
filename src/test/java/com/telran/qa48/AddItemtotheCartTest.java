package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemtotheCartTest extends TestBase {
    @Test
    public void addItemTest(){
        app.getItem().addFirstItemtoCart();
        Assert.assertTrue(app.getItem().isElementPresent
                (By.cssSelector("#dialog-notifications-success")));
        app.getItem().goToMainPageButton();
        app.getItem().addSecondItemToCart();
        Assert.assertTrue(app.getItem().isElementPresent
                (By.cssSelector("#dialog-notifications-success")));

    }

}
