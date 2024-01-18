package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class ModalDialogsElements extends BasePage {

    private static final String SMALL_MODAL_BUTTON = "//button[@id='showSmallModal']";
    private static final String LARGE_MODAL_BUTTON = "//button[@id='showLargeModal']";
    private static final String CLOSE_SMALL_MODAL_BUTTON = "//button[@id='closeSmallModal']";
    private static final String CLOSE_LARGE_MODAL_BUTTON = "//button[@id='closeLargeModal']";
    private static final String SMALL_MODAL_HEADER = "//div[@id='example-modal-sizes-title-sm']";
    private static final String LARGE_MODAL_HEADER = "//div[@id='example-modal-sizes-title-lg']";

    protected SelenideElement getSmallModalButton() {
        return $x(SMALL_MODAL_BUTTON);
    }

    public boolean getSmallModalHeader(String text) {
        return $x(SMALL_MODAL_HEADER).getText().contains(text);
    }

    public boolean getLargeModalHeader(String text) {
        return $x(LARGE_MODAL_HEADER).getText().contains(text);
    }

    protected SelenideElement getLargeModalButton() {
        return $x(LARGE_MODAL_BUTTON);
    }

    protected SelenideElement getCloseLargeModalButton() {
        return $x(CLOSE_LARGE_MODAL_BUTTON);
    }

    protected SelenideElement getCloseSmallModalButton() {
        return $x(CLOSE_SMALL_MODAL_BUTTON);
    }

}
