package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

        public class HomePageShopTest extends TestBase {

            @Test
            public void isElementPresentTest() {

                Assert.assertTrue(isElementPresent());
            }


            public boolean isElementPresent() {
                return isElementPresent(By.cssSelector(
                        "div:nth-child(1)>div:nth-child(3)>ul:nth-child(1)>li:nth-child(1)>a:nth-child(1)"
                ));
            }
        }


