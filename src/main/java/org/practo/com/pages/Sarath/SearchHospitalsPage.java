package org.practo.com.pages.Sarath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class SearchHospitalsPage {
    WebDriver driver;
    JavascriptExecutor js;
    @FindBy(xpath = "//input[@placeholder = 'Search location']")
    WebElement currentLocation;
    @FindBy(xpath = "//input[@placeholder = 'Search location']")
    WebElement location;
    @FindBy(xpath = "//button[@class = 'c-omni-clear']")
    WebElement clearLocation;
    @FindBy(xpath = "//div[@class = 'c-omni-suggestion-group']//div[text() = 'Bangalore']")
    WebElement Bangalore;
    @FindBy(xpath = "//div[@class = 'c-hospital-listingV2']//ol//li")
    List<WebElement> Hospitals;

    public SearchHospitalsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void printallHospitals()
    {
        for (WebElement hospital:Hospitals){
            System.out.println(hospital.getText());
        }
    }

    public void  clickHospitalBanglore(){
        if (!currentLocation.getText().equals("Bangalore")){
            location.click();
            clearLocation.click();
            location.sendKeys("Bangalore");
            Bangalore.click();
        }
    }

    public boolean isHospitalDisplayed() {
        if (Hospitals.size() > 0) {
            return true;
        }
        return false;
    }
}
