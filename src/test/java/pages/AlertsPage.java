package pages;

import com.codeborne.selenide.Selenide;
import elements.AlertElements;

public class AlertsPage extends AlertElements {

    public AlertsPage clickAlertButton() {
        getAlertButton().click();
        return this;
    }

    public AlertsPage clickAlertAfterFiveSeconds() {
        getAlertAfterFiveSecondsButton().click();
        Selenide.sleep(1000);
        return this;
    }

    public AlertsPage clickBoxAlert() {
        getConfirmBoxAlertButton().click();
        return this;
    }

    public AlertsPage clickPromptBoxAlert() {
        getPromptBoxAlertButton().click();
        return this;
    }
}
