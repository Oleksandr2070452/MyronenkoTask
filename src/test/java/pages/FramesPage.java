package pages;

import elements.FramesElements;

import static com.codeborne.selenide.Selenide.switchTo;

public class FramesPage extends FramesElements {

    public FramesPage switchToFirstFrame() {
        switchTo().frame(getFirstIframe());
        return this;
    }

    public FramesPage switchToSecondFrame() {
        switchTo().frame(getSecondIframe());
        return this;
    }
}
