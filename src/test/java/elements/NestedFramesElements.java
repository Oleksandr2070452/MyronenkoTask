package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class NestedFramesElements extends BasePage {

    private final static String PARENT_FRAME = "//iframe[@id='frame1']";
    private final static String PARENT_FRAME_TEXT = "//body[text()='Parent frame']";
    private final static String CHILD_FRAME_TEXT = "//p[text()='Child Iframe']";
    private final static String CHILD_FRAME = "//iframe[@srcdoc='<p>Child Iframe</p>']";

    protected SelenideElement getParentFrame() {
        return $x(PARENT_FRAME);
    }

    protected SelenideElement getChildFrame() {
        return $x(CHILD_FRAME);
    }

    public SelenideElement getParentFrameText() {
        return $x(PARENT_FRAME_TEXT);
    }

    public SelenideElement getChildFrameText() {
        return $x(CHILD_FRAME_TEXT);
    }
}
