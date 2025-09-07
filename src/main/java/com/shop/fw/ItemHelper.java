package com.shop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void addSecondItemToCart() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }

    public void goToMainPageButton() {
        click(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
    }

    public void addFirstItemtoCart() {
        click(By.xpath("(//input[@value='Add to cart'])[5]"));
        click(By.cssSelector("input[value='89']"));
        click(By.cssSelector("input[value='Add to cart']"));
    }

    public void removeItemFromCart() {
        click(By.name("removefromcart"));
        click(By.cssSelector("input[value='Update shopping cart']"));
    }

    public void goToCartButton() {
        click(By.cssSelector("[href='/cart']"));
    }
}
