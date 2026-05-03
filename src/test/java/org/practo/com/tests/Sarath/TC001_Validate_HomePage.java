package org.practo.com.tests.Sarath;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.Sarath.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_Validate_HomePage extends baseclass {

    @Test
    public void validateHomePage() {

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isHomePageOpened(),"Practo.com page NOT opened");
    }
}
