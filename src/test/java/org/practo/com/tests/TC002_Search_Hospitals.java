package org.practo.com.tests;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.HomePage;
import org.practo.com.pages.SearchHospitalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Search_Hospitals extends baseclass{
    @Test
    public void validateSearchHospitals(){
        HomePage homePage = new HomePage(driver);
        SearchHospitalsPage searchHospitalsPage = new SearchHospitalsPage(driver);
        homePage.clickSearchForHospitals();
        searchHospitalsPage.clickHospitalBanglore();
        Assert.assertTrue(searchHospitalsPage.isHospitalDisplayed(),"Top Cities Not Displayed");
    }
}
