package Tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterTest {

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

    @Test (priority = 1)
    public void register() {

    }
}
