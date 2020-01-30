package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
    private WebDriver driver;

    @FindBy( css = "[name=\"firstName\"]" )
    WebElement txtFirstName;

    @FindBy( css = "[name=\"lastName\"]" )
    WebElement txtLastName;

    @FindBy( css = "[name=\"email\"]")
    WebElement txtUserName;

    @FindBy( css = "[name=\"password\"]" )
    WebElement txtPassword;

    @FindBy( css = "[name=\"confirmPassword\"]" )
    WebElement txtConfirmPassword;

    @FindBy( css = "[name=\"register\"]" )
    WebElement btnRegister;

    @FindBy( css = "[href^=\"mercurysignon\"]" )
    WebElement txtSignIn;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static RegistrationPage using(WebDriver driver){
        return new RegistrationPage(driver);
    }

    public RegistrationPage launch(){
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        return this;
    }

    public RegistrationPage setFirstName(String firstName){
        this.txtFirstName.sendKeys(firstName);
        return this;
    }

    public RegistrationPage setLastName(String strLastName){
        this.txtLastName.sendKeys(strLastName);
        return this;
    }

    public RegistrationPage setUserName(String strUserName){
        this.txtUserName.sendKeys(strUserName);
        return this;
    }

    public RegistrationPage setPassword(String strPassword){
        this.txtPassword.sendKeys(strPassword);
        return this;
    }

    public RegistrationPage setConfirmPassword(String strConfirmPassword){
        this.txtConfirmPassword.sendKeys(strConfirmPassword);
        return this;
    }

    public RegistrationPage clickOnButtonRegister(){
        this.btnRegister.click();
        return this;
    }

    public void clickToSignInLink(){
        this.txtSignIn.click();
    }


}
