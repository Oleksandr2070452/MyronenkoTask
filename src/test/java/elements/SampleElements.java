package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class SampleElements extends BasePage {

    private final static String PAGE_TITLE = "//h1";

    public SelenideElement getPageTitle() {
        return getVisibleOfElement(PAGE_TITLE);
    }
}
