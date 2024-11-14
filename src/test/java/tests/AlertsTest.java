package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertsTest extends BaseTest{

    @Test
    public void testwhenClickAlerts5Minuts() {
        homePage
                .clickAlertFrameWindowsBtn()
        .alertsWindwsPage
                .clickAlertsBtn()
                .clickAlert5Min();

        String actual = waitAlert();

        closeAlert();

        assertEquals("This alert appeared after 5 seconds", actual);
    }

}
