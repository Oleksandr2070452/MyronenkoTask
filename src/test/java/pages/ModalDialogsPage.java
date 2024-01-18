package pages;

import elements.ModalDialogsElements;

public class ModalDialogsPage extends ModalDialogsElements {

    public ModalDialogsPage clickSmallModalButton() {
        getSmallModalButton().click();
        return this;
    }

    public ModalDialogsPage clickLargeModalButton() {
        getLargeModalButton().click();
        return this;
    }

    public ModalDialogsPage clickCloseLargeModalButton() {
        getCloseLargeModalButton().click();
        return this;
    }

    public ModalDialogsPage clickCloseSmallModalButton() {
        getCloseSmallModalButton().click();
        return this;
    }
}
