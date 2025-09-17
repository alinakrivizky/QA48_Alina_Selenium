package com.telran.qa48;

import com.shop.models.RegisteredUser;
import com.shop.models.UnregisteredUser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

