package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.NestedFramesPage;

import static com.codeborne.selenide.Selenide.switchTo;

public class NestedFramesTests extends TestInit {

    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private NestedFramesPage nestedFramesPage = new NestedFramesPage();

    @BeforeMethod
    public void clickToNestedContainer() {
        alertsWindowsPage.clickToNestedFramesContainer();
    }

    @Test
    public void checkNestedFrames(){


    }
}
