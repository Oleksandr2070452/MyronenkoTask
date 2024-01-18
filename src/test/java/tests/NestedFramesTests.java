package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.AlertsWindowsPage;
import pages.FramesPage;
import pages.NestedFramesPage;

import static com.codeborne.selenide.Selenide.switchTo;

public class NestedFramesTests extends TestInit {

    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private FramesPage framesPage = new FramesPage();
    private NestedFramesPage nestedFramesPage = new NestedFramesPage();

    @BeforeMethod
    public void clickToNestedContainer() {
        alertsWindowsPage.clickToNestedFramesContainer();
    }

    @Test
    public void checkNestedFrames() {
        nestedFramesPage.switchToParentFrame();

        assertTrue(nestedFramesPage.getParentFrameText().isDisplayed(), "Text is not visible");

        nestedFramesPage.switchToChildFrame();

        assertTrue(nestedFramesPage.getChildFrameText().isDisplayed(), "Text is not visible");

        switchTo().parentFrame();

        assertTrue(nestedFramesPage.getParentFrameText().isDisplayed(), "Text is not visible");

        switchTo().defaultContent();

        assertTrue(framesPage.getMainPageContainer().isDisplayed(), "Text is not visible");
    }
}
