package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver);
    }

    protected String waitAlert(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(d -> d.switchTo().alert().getText());
    }

    protected void closeAlert(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> d.switchTo().alert());
        driver.switchTo().alert().accept();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }


}
