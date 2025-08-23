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
    public void findH1Element() {
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


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}