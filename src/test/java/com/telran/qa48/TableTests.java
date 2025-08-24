package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementsInTableWithCssTableWithCssTest(){
        //print number of row
        List<WebElement>rows=driver.findElements(By.cssSelector("tr"));
        System.out.println("rows in table is "+rows.size());
        for(WebElement row:rows){
            System.out.println(row.getText());
        }
    }
}
