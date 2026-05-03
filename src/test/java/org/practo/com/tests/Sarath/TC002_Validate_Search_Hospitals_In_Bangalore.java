package org.practo.com.tests.Sarath;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.Sarath.HomePage;
import org.practo.com.pages.Sarath.SearchHospitalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Validate_Search_Hospitals_In_Bangalore extends baseclass{
    @Test
    public void validateSearchHospitals(){
        HomePage homePage = new HomePage(driver);
        SearchHospitalsPage searchHospitalsPage = new SearchHospitalsPage(driver);
        homePage.clickSearchForHospitals();
        searchHospitalsPage.clickHospitalBanglore();
        Assert.assertTrue(searchHospitalsPage.isHospitalDisplayed(),"Hospitals Not Displayed");
    }
}
