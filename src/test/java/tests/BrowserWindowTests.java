package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.BrowserWindowPage;
import pages.SamplePage;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.switchTo;

public class BrowserWindowTests extends TestInit {

    private BrowserWindowPage browserWindowPage = new BrowserWindowPage();
    private AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    private SamplePage samplePage = new SamplePage();
    private String pageTitle = "This is a sample page";

    @BeforeMethod
    public void clickToBrowserWindowContainer() {
        alertsWindowsPage.clickToBrowserWindowsContainer();
    }

    @Test
    public void checkPageRedirection() {
        browserWindowPage.clickNewTabButton();
        switchTo().window(1);

        assertTrue(getUrl("sample"), "Endpoint is not correct");
        assertTrue(samplePage.isPageTitleVisible(pageTitle), "Page title is not correct");

        closeWindow();

        switchTo().window(0);

        assertTrue(getUrl("browser-windows"), "Endpoint is not correct");
    }

    @Test
    public void checkOpenNewWindow() {
        browserWindowPage.clickNewWindowButton();

        switchTo().window(1);
        WebDriverRunner.getWebDriver().manage().window().maximize();

        assertTrue(getUrl("sample"), "Endpoint is not correct");
        assertTrue(samplePage.isPageTitleVisible(pageTitle), "Page title is not correct");

        closeWindow();
        switchTo().window(0);

        assertTrue(getUrl("browser-windows"));
    }

    @Test
    public void checkNewWindowMessage() {
        browserWindowPage.clickNewWindowMessageButton();

        assertTrue(browserWindowPage.getNewWindowMessagePageBody().isDisplayed(), "Text is not displayed");

        closeWindow();
    }
}
