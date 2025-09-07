package com.telran.qa48;

import org.openqa.selenium.By;
import org. testng.Assert;
import org.testng.annotations.Test;

public class DeleteItemTest extends TestBase{
    @Test
    public void deleteItemTest(){
        app.getItem().addFirstItemtoCart();
        Assert.assertTrue(app.getItem().isElementPresent(By.cssSelector("#dialog-notifications-success")));
        app.getItem().goToMainPageButton();
        app.getItem().goToCartButton();
        app.getItem().removeItemFromCart();
        Assert.assertTrue(app.getItem().isElementPresent(By.cssSelector("#dialog-notifications-success")));
    }

}
