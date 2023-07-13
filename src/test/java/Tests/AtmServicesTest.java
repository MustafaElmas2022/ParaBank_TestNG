package Tests;

import Pages.ATMServices;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AtmServicesTest {

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        Utilities.waitFor(3);
        Driver.closeDriver();
    }

    @Test(priority = 3)
    public void atmServices(){
        ATMServices atm = new ATMServices();
        atm.atmServicesFoto.isDisplayed();
        atm.atmServicesText.isDisplayed();
        Assert.assertEquals(atm.atmServicesText.getText(), "ATM Services");
    }
}
