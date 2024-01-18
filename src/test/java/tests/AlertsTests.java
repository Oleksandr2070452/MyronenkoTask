package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.AlertsWindowsPage;

import static com.codeborne.selenide.Selenide.switchTo;
import static utils.AlertUtils.isAlertPresent;

public class AlertsTests extends TestInit {

    private AlertsPage alertsPage = new AlertsPage();
    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private String name = "Oleksandr";


    @BeforeMethod
    private void clickToAlertContainer() {
        alertsWindowsPage.clickToAlertsContainer();
    }

    @Test
    public void checkVisibilityOfAlert() {
        alertsPage.clickAlertButton();

        assertTrue(isAlertPresent(), "Alert is not appear");

        switchTo().alert().accept();
    }

    @Test
    public void checkVisibilityOfAlertAfterFiveSeconds() {
        alertsPage.clickAlertAfterFiveSeconds();

        assertTrue(isAlertPresent(), "Alert is not appear");

        switchTo().alert().accept();
    }

    @Test
    public void checkConfirmAlert() {
        alertsPage.clickBoxAlert();

        assertTrue(isAlertPresent(), "Alert is not appear");

        switchTo().alert().accept();

        assertTrue(alertsPage.isAlertResultVisible("You selected Ok"), "Result is not visible");
    }

    @Test
    public void checkCancelAlert() {
        alertsPage.clickBoxAlert();

        assertTrue(isAlertPresent(), "Alert is not appear");

        switchTo().alert().dismiss();

        assertTrue(alertsPage.isAlertResultVisible("You selected Cancel"), "Result is not visible");
    }


    @Test
    public void checkPromptAlert() {
        alertsPage.clickPromptBoxAlert();

        assertTrue(isAlertPresent(), "Alert is not appear");

        switchTo().alert().sendKeys(name);
        switchTo().alert().accept();

        assertTrue(alertsPage.isPromptAlertResultVisible("You entered Oleksandr"), "Entered text is not visible");
    }

}


