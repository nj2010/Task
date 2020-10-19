package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "email")
    public WebElement emailOrPhoneNumberInputField;

    @FindBy(id = "pass")
    public WebElement passwordInputField;

    @FindBy(xpath="//button[@name='login']")
    public WebElement logInButton;

    @FindBy(xpath ="//a[text()='Forgot Password?']")
    public WebElement forgotPassword;


    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement createNewAccountButton;

    @FindBy(id="pageTitle")
    public WebElement pageTitle;

}
