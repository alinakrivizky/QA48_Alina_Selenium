package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void loginTest(){
        clickOnLoginLink();
        fillLoginForm(new RegisteredUser().setEmail("krivickaaa@gmail.com").setPassword("aL2112!"));
        clickOnLoginButton();
        Assert.assertTrue(isElementPresent(By.cssSelector
                ("#dialog-notifications-success")));



    }

}
