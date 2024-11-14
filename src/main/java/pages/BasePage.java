package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    BasePage(WebDriver driver){
        this.driver = driver;
    }

    WebElement findElementByText(String text){
        String xpath = "//*[text()='"+ text +"']";
        return driver.findElement(By.xpath(xpath));
    }

}
