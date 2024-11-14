package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsWindwsPage extends BasePage{
    AlertsWindwsPage(WebDriver driver) {
        super(driver);
    }

    public AlertsWindwsPage clickAlertsBtn(){
        findElementByText("Alerts").click();
        return this;
    }

    public AlertsWindwsPage clickAlert5Min(){
        driver.findElement(By.id("timerAlertButton")).click();
        return this;
    }

}
