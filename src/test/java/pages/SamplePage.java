package pages;

import elements.SampleElements;

public class SamplePage extends SampleElements {

    public boolean isPageTitleVisible(String text) {
        return getPageTitle().getText().contains(text);
    }
}
