package com.shop.fw;

import com.shop.models.RegisteredUser;
import com.shop.models.UnregisteredUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void fillRegistrationForm(UnregisteredUser unregisteredUser) {
        type(By.name("FirstName"), unregisteredUser.getFirstName());
        type(By.name("LastName"),unregisteredUser.getLastName());
        //int i = (int)((System.currentTimeMillis() / 1000) % 3600);
        //String email = "alina" + i + "@gmail.com";
        type(By.name("Email"), unregisteredUser.getEmail());
        type(By.name("Password"), unregisteredUser.getPassword());
        type(By.name("ConfirmPassword"), unregisteredUser.getConfirmPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("a[href='/register']"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input[value='Log in']"));
    }

    public void fillLoginForm(RegisteredUser registeredUser) {
        type(By.name("Email"), registeredUser.getEmail());
        type(By.name("Password"), registeredUser.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }
}
