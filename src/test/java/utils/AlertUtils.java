package utils;

import org.openqa.selenium.NoAlertPresentException;

import static com.codeborne.selenide.Selenide.switchTo;

public class AlertUtils {

    public static boolean isAlertPresent() {
        try {
            switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}