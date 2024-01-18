package pages;

import elements.NestedFramesElements;

import static com.codeborne.selenide.Selenide.switchTo;

public class NestedFramesPage extends NestedFramesElements {

    public NestedFramesPage switchToParentFrame() {
        switchTo().frame(getParentFrame());
        return this;
    }

    public NestedFramesPage switchToChildFrame() {
        switchTo().frame(getChildFrame());
        return this;
    }
}
