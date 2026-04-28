package org.practo.com.tests;
import org.practo.com.baseclass.baseclass;
import org.practo.com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_Home_page_Opened extends baseclass {

    @Test
    public void validateCreateAccountPageOpened() {

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(
                homePage.isHomePageOpened(),
                "Practo.com page NOT opened"
        );
    }
}
