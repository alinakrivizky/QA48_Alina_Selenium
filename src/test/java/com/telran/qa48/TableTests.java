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
        //for row tr for column td
        //print number of row
        List<WebElement>rows=driver.findElements(By.cssSelector("tr"));
        System.out.println("rows in table is "+rows.size());
        for(WebElement row:rows){
            System.out.println(row.getText());
            //get row4
            WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));//xpath //tr[4]
            System.out.println(row4.getText());
            //get first item in row
            WebElement item1 =driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(1)"));
            System.out.println(item1.getText());
            //get last child
            WebElement item2 =driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
            System.out.println(item2.getText());


        }
    }
}
