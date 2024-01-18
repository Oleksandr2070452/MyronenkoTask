package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class BrowserWindowElements extends BasePage {

    private final static String NEW_TAB_BUTTON = "//button[@id='tabButton']";
    private final static String NEW_WINDOW_BUTTON = "//button[@id='windowButton']";
    private final static String NEW_WINDOW_MESSAGE_BUTTON = "//button[@id='messageWindowButton']";
    private final static String NEW_WINDOW_MESSAGE_PAGE_BODY = "//body";

    protected SelenideElement getNewTabButton() {
        return $x(NEW_TAB_BUTTON);
    }

    protected SelenideElement getNewWindowButton() {
        return $x(NEW_WINDOW_BUTTON);
    }

    protected SelenideElement getNewWindowMessageButton() {
        return $x(NEW_WINDOW_MESSAGE_BUTTON);
    }

    public SelenideElement getNewWindowMessagePageBody() {
        return getVisibleOfElement(NEW_WINDOW_MESSAGE_PAGE_BODY);
    }
}
