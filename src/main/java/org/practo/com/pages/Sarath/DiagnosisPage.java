package org.practo.com.pages.Sarath;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DiagnosisPage {
    WebDriver driver;
    public DiagnosisPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "ul li div.o-f-color--primary")
    List<WebElement> TopCities;
    public void printTopCities() {
        for (WebElement element : TopCities) {
            System.out.println(element.getText());
        }
    }
    public boolean isTopCitiesDisplayed() {
        if (TopCities.size() > 0) {
            return true;
        }
        return false;
    }
}
