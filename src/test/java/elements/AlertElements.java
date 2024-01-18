package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class AlertElements extends BasePage {

    private final static String ALERT_BUTTON = "//button[@id='alertButton']";
    private final static String ALERT_AFTER_5_SEC_BUTTON = "//button[@id='timerAlertButton']";
    private final static String CONFIRM_BOX_ALERT_BUTTON = "//button[@id='confirmButton']";
    private final static String PROMPT_BOX_ALERT_BUTTON = "//button[@id='promtButton']";
    private final static String PROMPT_BOX_ALERT_RESULTS = "//span[@id='promptResult']";
    private final static String ALERT_RESULTS = "//span[@id='confirmResult']";


    protected SelenideElement getAlertButton() {
        return getClickableOfElement(ALERT_BUTTON);
    }

    protected SelenideElement getAlertAfterFiveSecondsButton() {
        return getClickableOfElement(ALERT_AFTER_5_SEC_BUTTON);
    }

    public SelenideElement getConfirmBoxAlertButton() {
        return getClickableOfElement(CONFIRM_BOX_ALERT_BUTTON);
    }

    protected SelenideElement getPromptBoxAlertButton() {
        return getClickableOfElement(PROMPT_BOX_ALERT_BUTTON);
    }

    public boolean isAlertResultVisible(String text) {
        return getVisibleOfElement(ALERT_RESULTS).getText().contains(text);
    }

    public boolean isPromptAlertResultVisible(String text) {
        return getVisibleOfElement(PROMPT_BOX_ALERT_RESULTS).getText().contains(text);
    }

}
