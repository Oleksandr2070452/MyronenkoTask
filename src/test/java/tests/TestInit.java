package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class TestInit extends Assert {

    protected final String BASE_URL = "https://demoqa.com/alertsWindows";

    @BeforeMethod
    public void setup() {
        browser = "chrome";
        open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    protected boolean getUrl(String url) {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(url);
    }

    @AfterMethod
    public void closeTest() {
        WebDriverRunner.getWebDriver().quit();
    }
}
