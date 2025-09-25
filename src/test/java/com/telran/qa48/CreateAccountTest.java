package com.telran.qa48;

import com.shop.data.UnregisteredUserData;
import com.shop.models.UnregisteredUser;
import utils.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationForm(new UnregisteredUser().setFirstName
                        (UnregisteredUserData.FIRSTNAME)
                .setLastName(UnregisteredUserData.LASTNAME)
                .setEmail(UnregisteredUserData.EMAIL)
                .setPassword(UnregisteredUserData.PASSWORD)
                .setConfirmPassword(UnregisteredUserData.PASSWORD));

        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isElementPresent
                (By.cssSelector("#dialog-notifications-success")));


    }



    @Test(dataProvider = "loginDataProvider", dataProviderClass= DataProviders.class)
    public void registerViaDataProviderFromCSVFile( UnregisteredUser unregisteredUser) {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationForm(unregisteredUser);
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isElementPresent
                (By.cssSelector("#dialog-notifications-success")));



    }
}
