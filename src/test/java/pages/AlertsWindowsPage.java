package pages;

import elements.AlertsWindowsElements;

public class AlertsWindowsPage extends AlertsWindowsElements {

    public AlertsWindowsPage clickToBrowserWindowsContainer() {
        getBrowserWindowsContainer().click();
        return this;
    }

    public AlertsWindowsPage clickToAlertsContainer() {
        getAlertsContainer().click();
        return this;
    }

    public AlertsWindowsPage clickToFramesContainer() {
        scrollPageToElement(getFramesContainer());
        getFramesContainer().click();
        return this;
    }

    public AlertsWindowsPage clickToNestedFramesContainer() {
        scrollPageToElement(getNestedFramesContainer());
        getNestedFramesContainer().click();
        return this;
    }

    public AlertsWindowsPage clickToModalDialogsContainer() {
        scrollPageToElement(getModalDialogsContainer());
        getModalDialogsContainer().click();
        return this;
    }
}
