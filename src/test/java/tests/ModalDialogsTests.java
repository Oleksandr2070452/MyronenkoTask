package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.ModalDialogsPage;

public class ModalDialogsTests extends TestInit {

    private ModalDialogsPage modalDialogsPage = new ModalDialogsPage();
    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private String smallModalHeader = "Small Modal";
    private String largeModalHeader = "Large Modal";

    @BeforeMethod
    public void clickToModalDialogs() {
        alertsWindowsPage.clickToModalDialogsContainer();
    }

    @Test
    public void checkSmallModal() {
        modalDialogsPage.clickSmallModalButton();

        assertTrue(modalDialogsPage.getSmallModalHeader(smallModalHeader), "Small modal header is not visible");

        modalDialogsPage.clickCloseSmallModalButton();
    }

    @Test
    public void checkLargeModal() {
        modalDialogsPage.clickLargeModalButton();

        assertTrue(modalDialogsPage.getLargeModalHeader(largeModalHeader), "Large modal header is not visible");

        modalDialogsPage.clickCloseLargeModalButton();
    }
}
