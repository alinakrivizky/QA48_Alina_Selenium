package com.telran.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

        public class HomePageShopTest extends TestBase {

            @Test
            public void isElementPresentTest() {

                Assert.assertTrue(app.getHome().isElementPresent());
            }

        }


