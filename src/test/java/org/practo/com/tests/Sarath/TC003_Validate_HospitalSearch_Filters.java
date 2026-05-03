package org.practo.com.tests.Sarath;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.Sarath.HomePage;
import org.practo.com.pages.Sarath.SearchHospitalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_Validate_HospitalSearch_Filters extends baseclass{
    @Test
    public void validateSearchFilters(){
        HomePage homePage = new HomePage(driver);
        SearchHospitalsPage searchHospitalsPage = new SearchHospitalsPage(driver);
        homePage.clickSearchForHospitals();
        searchHospitalsPage.clickHospitalBanglore();
        searchHospitalsPage.printallHospitals();
        Assert.assertTrue(searchHospitalsPage.isHospitalDisplayed(),"Hospitals Not Filtered");
    }
}
