package com.telran.qa48;

import org.openqa.selenium.By;
import org. testng.Assert;
import org.testng.annotations.Test;

public class DeleteItemTest extends TestBase{
    @Test
    public void deleteItemTest(){
        addFirstItemtoCart();
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));
        goToMainPageButton();
        goToCartButton();
        removeItemFromCart();
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));
    }

}
