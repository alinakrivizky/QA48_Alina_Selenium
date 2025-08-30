package com.telran.qa48;

import org.openqa.selenium.By;
import org. testng.Assert;
import org.testng.annotations.Test;

public class DeleteItemTest extends TestBase{
    @Test
    public void deleteItemTest(){
        click(By.xpath("(//input[@value='Add to cart'])[5]"));
        click(By.cssSelector("input[value='89']"));
        click(By.cssSelector("input[value='Add to cart']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));
        click(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        click(By.cssSelector("[href='/cart']"));
        click(By.name("removefromcart"));
        click(By.cssSelector("input[value='Update shopping cart']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dialog-notifications-success")));
    }
}
