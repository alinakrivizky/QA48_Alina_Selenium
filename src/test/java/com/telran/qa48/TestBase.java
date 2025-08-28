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
}





