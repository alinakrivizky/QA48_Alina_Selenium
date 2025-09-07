package com.telran.qa48;

import com.shop.models.UnregisteredUser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationForm(new UnregisteredUser().setFirstName("Alina")
                .setLastName("Krivizky")
                .setEmail("alinA21@gmail.com")
                .setPassword("aL2112!")
                .setConfirmPassword("aL2112!"));

        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isElementPresent
                (By.cssSelector("#dialog-notifications-success")));




    }

}
