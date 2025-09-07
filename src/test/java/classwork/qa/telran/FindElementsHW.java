package classwork.qa.telran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsHW {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tools/chromedriver-mac-arm64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // for last version of chrome without its not working

        driver = new ChromeDriver(options);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void findH1Element(By xpath) {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement element = driver.findElement(By.tagName("h3"));
        System.out.printf(element.getText());
        List<WebElement> list = driver.findElements(By.tagName("div"));
        System.out.println(list.size());
    }
        @Test
        public void findElementsBySimpleLocators() {
            driver.get("https://demowebshop.tricentis.com/");
           WebElement elementid = driver.findElement(By.id("bar-notification"));;
            driver.findElement(By.className("topic-html-content-header"));
            driver.findElement(By.linkText("Simple Computer"));
            //by partial link
            driver.findElement(By.partialLinkText("Computer"));

        // List<WebElement> h3List = driver.findElements(By.tagName("h3"));
        //if (!h1List.isEmpty()) {
        // System.out.println("Найден h3: " + h1List.get(0).getText());
        //} else {
        //System.out.println("h3 не найден");
    }
      @Test
      public void findElementByCssSelectorHW() {
          //"#id css"
          driver.get("https://demowebshop.tricentis.com/");
          driver.findElement(By.cssSelector("#bar-notification"));
          //".class_name"
          driver.findElement(By.cssSelector(".topic-html-content-header"));
          //"[attr='value']"
          driver.findElement(By.cssSelector("[href='/register']"));
          //contains (wishlist-> href*='/wish')
          driver.findElement(By.cssSelector("[href*='/wish']"));
          //href^ start
          driver.findElement(By.cssSelector("[href^='/wi']"));
          //href$ end
          driver.findElement(By.cssSelector("[href$='/wishlist']"));
          //SelectorHub
          //tag +id
          driver.findElement(By.cssSelector("div#bar-notification"));
          //tag+class
          driver.findElement(By.cssSelector("div.header-logo"));
      }
      @Test
    public void findElementByXpathHW() {
          driver.get("https://demowebshop.tricentis.com/");
          //tag->xpath //tag
          driver.findElement(By.xpath("//h3"));
        //id->xpath //*[@id='value']
          driver.findElement(By.xpath("//div[@id='bar-notification']"));
          //class_name->xpath //*[@class='value']
          driver.findElement(By.xpath("//div[@class='header-logo']"));
          //contains->//[contains(.,'Text')]
          driver.findElement(By.xpath("//h2[contains(.,'Card')]"));
          //equal->//*[text()='Text']
         //driver.findElement(By.xpath("//h2[text()='$25 Virtual Gift Card']")); didnt work cause text placed in a not in h2 directly
          driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']"));
          driver.findElement(By.xpath("//a[.='$25 Virtual Gift Card']"));
          //start->*[starts-with(@attr,'Text'])
          driver.findElement(By.xpath("//label[starts-with(@for,'p')]"));
          //move up
          driver.findElement(By.xpath("//a[@class='ico-wishlist']/.."));
          //parent
          driver.findElement(By.xpath("//h2/parent::*"));
          driver.findElement(By.xpath("//h3/parent::div"));//two options
          driver.findElement(By.xpath("//h3/.."));
          //ancestor
          driver.findElement(By.xpath("//h2/ancestor::*"));
          driver.findElement(By.xpath("//h3/ancestor::div[2]"));//one option


      }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}