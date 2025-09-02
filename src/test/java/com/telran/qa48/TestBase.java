package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
        WebDriver driver;

    @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demowebshop.tricentis.com/");
        }

        @AfterMethod
        public void tearDown() {
            //driver.quit();
        }

        public boolean isElementPresent(By locator) {
            return driver.findElements(locator).size() > 0;
        }

    public void click(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(locator))
                .click();

    }

    public void type(By locator, String text) {
        click(locator);//FirstName"
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
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





