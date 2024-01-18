package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.FramesPage;

import static com.codeborne.selenide.Selenide.switchTo;

public class FramesTests extends TestInit {

    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private FramesPage framesPage = new FramesPage();


    @BeforeMethod
    public void clickToFramesContainer() {
        alertsWindowsPage.clickToFramesContainer();
    }

    @Test
    public void checkFirstFrame() {
        framesPage.switchToFirstFrame();

        assertTrue(framesPage.getFrameHeader().getText().contains("This is a sample page"));

        switchTo().defaultContent();

        assertTrue(framesPage.getMainPageContainer().isDisplayed(), "Main container is not visible");
    }

    @Test
    public void checkSecondFrame() {
        framesPage.switchToSecondFrame();

        assertTrue(framesPage.getFrameHeader().getText().contains("This is a sample page"));

        switchTo().defaultContent();

        assertTrue(framesPage.getMainPageContainer().isDisplayed(), "Main container is not visible");
    }

    @Test
    public void framesManipulations() {
        framesPage.switchToFirstFrame();

        assertTrue(framesPage.getFrameHeader().getText().contains("This is a sample page"));

        switchTo().defaultContent();

        assertTrue(framesPage.getMainPageContainer().isDisplayed(), "Main container is not visible");

        framesPage.switchToSecondFrame();

        assertTrue(framesPage.getFrameHeader().getText().contains("This is a sample page"));

        switchTo().defaultContent();

        assertTrue(framesPage.getMainPageContainer().isDisplayed(), "Main container is not visible");
    }
}
