package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ATMServices extends BasePage{

    @FindBy (xpath = "//span[@class='services']")
    public WebElement atmServicesFoto;

    @FindBy (xpath = "//li[@class='captionone']")
    public WebElement atmServicesText;
}
