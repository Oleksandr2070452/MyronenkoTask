package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class FramesElements extends BasePage {

    private static final String FIRST_IFRAME = "//iframe[@id='frame1']";
    private static final String SECOND_IFRAME = "//iframe[@id='frame2']";
    private static final String FRAME_HEADER = "//h1";
    private static final String MAIN_PAGE_CONTAINER = "//div[@class='container playgound-body']";

    protected SelenideElement getFirstIframe() {
        return $x(FIRST_IFRAME);
    }

    protected SelenideElement getSecondIframe() {
        return $x(SECOND_IFRAME);
    }

    public SelenideElement getFrameHeader() {
        return $x(FRAME_HEADER);
    }

    public SelenideElement getMainPageContainer() {
        return $x(MAIN_PAGE_CONTAINER);
    }

}
