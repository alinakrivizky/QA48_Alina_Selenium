package com.telran.qa48;

import com.shop.models.RegisteredUser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void loginTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new RegisteredUser().setEmail("krivickaaa@gmail.com").setPassword("aL2112!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector
                ("#dialog-notifications-success")));



    }

}
