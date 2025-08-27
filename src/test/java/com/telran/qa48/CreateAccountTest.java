package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        driver.findElement(By.cssSelector("a[href='/register']")).click();
        //firstname
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Alina");
        //lastname
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Krivizky");
        //email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("krivickaaa@gmail.com");
        //password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("aL2112!");
        //confirmpassword
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("aL2112!");
        //button
        driver.findElement(By.id("register-button")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".result")),
                "Registration was not successful!");




    }
}
