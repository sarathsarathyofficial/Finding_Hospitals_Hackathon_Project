package org.practo.com.tests;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.DiagnosisPage;
import org.practo.com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC003_Print_Top_Cities extends baseclass{
    @Test
    public void Print_Top_Cities() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        DiagnosisPage diagnosisPage = new DiagnosisPage(driver);
        homePage.clickLabTests();
        diagnosisPage.printTopCities();
        Assert.assertTrue(diagnosisPage.isTopCitiesDisplayed(),"Top Cities Not Displayed");
    }
}
