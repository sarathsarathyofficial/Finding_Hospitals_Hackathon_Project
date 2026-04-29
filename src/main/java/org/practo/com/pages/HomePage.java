package org.practo.com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(linkText = "Practo Pro") WebElement practoPro;
    @FindBy(linkText = "Lab Tests") WebElement labTests;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isHomePageOpened() {
        if (practoPro.isDisplayed()){
            return true;
        }
        return false;
    }
    public void clickLabTests(){
        labTests.click();
    }

}
