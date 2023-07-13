package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BasePage {
    @FindBy (xpath = "//a[normalize-space()='Register']")
    public WebElement register;

    @FindBy (xpath = "//h1[normalize-space()='Signing up is easy!']")
    public WebElement signingUpIsEasy;

    @FindBy (xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy (xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy (xpath = "//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy (xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy (xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy (xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy (xpath = "//input[@id='customer.username']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmPassword;

    @FindBy (xpath = "//input[@value='Register']")
    public WebElement registerButton;

}
