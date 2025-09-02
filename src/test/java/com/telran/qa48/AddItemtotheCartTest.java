package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemtotheCartTest extends TestBase {
    @Test
    public void addItemTest(){
        addFirstItemtoCart();
        Assert.assertTrue(isElementPresent
                (By.cssSelector("#dialog-notifications-success")));
        goToMainPageButton();
        addSecondItemToCart();
        Assert.assertTrue(isElementPresent
                (By.cssSelector("#dialog-notifications-success")));

    }

}
