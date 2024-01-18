package pages;

import elements.BrowserWindowElements;

public class BrowserWindowPage extends BrowserWindowElements {

    public BrowserWindowPage clickNewTabButton() {
        getNewTabButton().click();
        return this;
    }

    public BrowserWindowPage clickNewWindowButton() {
        getNewWindowButton().click();
        return this;
    }

    public BrowserWindowPage clickNewWindowMessageButton() {
        getNewWindowMessageButton().click();
        return this;
    }
}
