package classwork.qa.telran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    ChromeDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/");
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementByTagName(){

        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.printf(element.getText());
        WebElement element1= driver.findElement(By.tagName("a"));
        System.out.printf(element1.getText());
//find list of elements
        List<WebElement> list =driver.findElements(By.tagName("a"));
        System.out.println(list.size());
    }
    @Test
    public void findElementsBySimpleLocators(){
        //by id
        driver.findElement(By.id("root"));
        //by class name
        driver.findElement(By.className("mobile-header"));
        //by link Text
        driver.findElement(By.linkText("Let car work"));
        //by partial link
        driver.findElement(By.partialLinkText("car"));
    }
    @Test
    public void findElementByCssSelector(){
        //id->scc(#)
        //driver.findElement(By.id("root"));
        driver.findElement(By.cssSelector("#root"));
        //classname->scc(.)
        //driver.findElement(By.className("mobile-header"));
        driver.findElement(By.cssSelector(".mobile-header"));
        //tagName=css
        // driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("h1"));
        //[attr='value']
        driver.findElement(By.cssSelector("[href='/login']"));
        //partial coincidence with *
        driver.findElement(By.cssSelector("[href*='/let']"));
        //start-> ^
        driver.findElement(By.cssSelector("[href^='/le']"));
        //end->$
        //driver.findElement(By.cssSelector("[href$='/work']"));
        //tag + id
        driver.findElement(By.cssSelector("div#root"));
        driver.findElement(By.cssSelector("div.search-card"));
        //id->xpath - //*[@id='value']
//driver.findElement(By.id("#root"));
        driver.findElement(By.xpath("//div[@id='root']"));
        driver.findElement(By.xpath("//div[@class='mobile-header']"));
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        //equal-> //*[text()='Text']

        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));



    }



}
