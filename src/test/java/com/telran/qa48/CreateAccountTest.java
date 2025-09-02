package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        clickOnRegisterLink();
        fillRegistrationForm(new UnregisteredUser().setFirstName("Alina")
                .setLastName("Krivizky")
                .setEmail("alinA21@gmail.com")
                .setPassword("aL2112!")
                .setConfirmPassword("aL2112!"));

        clickOnRegisterButton();
        Assert.assertTrue(isElementPresent
                (By.cssSelector("#dialog-notifications-success")));




    }

}
