package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class AlertsWindowsElements extends BasePage {

    private static final String BROWSER_WINDOWS_CONTAINER = "//span[text()='Browser Windows']";
    private static final String ALERTS_CONTAINER = "//span[text()='Alerts']";
    private static final String FRAMES_CONTAINER = "//span[text()='Frames']";
    private static final String NESTED_FRAMES_WINDOWS_CONTAINER = "//span[text()='Nested Frames']";
    private static final String MODAL_DIALOGS_CONTAINER = "//span[text()='Modal Dialogs']";

    protected SelenideElement getBrowserWindowsContainer() {
        return $x(BROWSER_WINDOWS_CONTAINER);
    }

    protected SelenideElement getAlertsContainer() {
        return $x(ALERTS_CONTAINER);
    }

    protected SelenideElement getFramesContainer() {
        return $x(FRAMES_CONTAINER);
    }

    protected SelenideElement getNestedFramesContainer() {
        return $x(NESTED_FRAMES_WINDOWS_CONTAINER);
    }

    protected SelenideElement getModalDialogsContainer() {
        return $x(MODAL_DIALOGS_CONTAINER);
    }

}
