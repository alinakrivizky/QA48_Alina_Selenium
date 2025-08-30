package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemtotheCartTest extends TestBase {
    @Test
    public void addItemTest(){
        //to item page
        click(By.xpath("(//input[@value='Add to cart'])[5]"));
        click(By.cssSelector("input[value='89']"));
        click(By.cssSelector("input[value='Add to cart']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));
        click(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        click(By.xpath("(//input[@value='Add to cart'])[2]"));

    }

}
