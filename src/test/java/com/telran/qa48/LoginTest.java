package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void loginTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "krivickaaa@gmail.com");
        type(By.name("Password"), "aL2112!");
        click(By.cssSelector("input[value='Log in']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));



    }
}
