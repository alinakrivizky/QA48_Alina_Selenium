package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        click(By.cssSelector("a[href='/register']"));
        //firstname
        type(By.name("FirstName"), "Alina");
        //lastname
        type(By.name("LastName"),"Krivizky");
        //email
       type(By.name("Email"), "krivickaaa@gmail.com");
        //password
        type(By.name("Password"), "aL2112!");
        //confirmpassword
        type(By.name("ConfirmPassword"), "aL2112!");
        //button
        driver.findElement(By.id("register-button")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".result")),
                "Registration was not successful!");//




    }

}
