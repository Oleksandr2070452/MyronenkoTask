package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class NestedFramesElements extends BasePage {

    private final static String PARENT_FRAME = "//iframe[@id='frame1']";
    private final static String CHILD_FRAME = "//iframe[@id='frame2']";

    protected SelenideElement getParentFrame() {
        return $x(PARENT_FRAME);
    }

    protected SelenideElement getChildFrame() {
        return $x(CHILD_FRAME);
    }
}
