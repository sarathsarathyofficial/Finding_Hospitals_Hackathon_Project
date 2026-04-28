package org.practo.com.baseclass;
import org.practo.com.utility.ScreenshotUtil;
import org.practo.com.utility.Utility;
//import org.miniproject.utility.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.ITestResult;

import java.time.Duration;
public class baseclass {
    public WebDriver driver;

    @BeforeMethod
    public void BrowserSetup() throws Exception {
        if (Utility.fetchPropertyValue("browser").equals("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (Utility.fetchPropertyValue("browser").equals("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        } else if (Utility.fetchPropertyValue("browser").equals("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(Utility.fetchPropertyValue("baseUrl").toString());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        try {
            if (driver != null) {
                String testName = result.getMethod().getMethodName();
                if (result.getStatus() == ITestResult.FAILURE) {
                    ScreenshotUtil.takeScreenshot(driver, testName + "_FAILED");
                } else {
                    ScreenshotUtil.takeScreenshot(driver, testName + "_PASSED");
                }
            }
        } catch (Exception e) {
        }
        finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
