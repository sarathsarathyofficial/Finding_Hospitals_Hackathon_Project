package org.practo.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchHospitalsPage {
    WebDriver driver;
    public SearchHospitalsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class ='c-hospital-listingV2' ]//ol") List<WebElement> Hospitals;
    @FindBy(linkText = "Hospitals in Bangalore") WebElement clickHospitalBanglore;
    public void printallHospitals()
    {
        for (WebElement hospital:Hospitals){
            System.out.println(hospital.getText());
        }
    }

    public void  clickHospitalBanglore(){
        clickHospitalBanglore.click();
    }

    public boolean isHospitalDisplayed() {
        if (Hospitals.size() > 0) {
            return true;
        }
        return false;
    }
}
