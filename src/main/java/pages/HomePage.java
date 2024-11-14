package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AlertsWindwsPage alertsWindwsPage;

    public HomePage clickAlertFrameWindowsBtn(){
        findElementByText("Alerts, Frame & Windows").click();
        alertsWindwsPage = new AlertsWindwsPage(driver);
        return this;
    }
}
