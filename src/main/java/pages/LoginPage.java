package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy( name = "userName")
    WebElement txtUserName;

    @FindBy( name = "password" )
    WebElement txtPassword;

    @FindBy( name = "login" )
    WebElement btnSubmit;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public static LoginPage using(WebDriver driver){
        return new LoginPage(driver);
    }

    public LoginPage setUserName(String strUserName){
        this.txtUserName.sendKeys(strUserName);
        return this;
    }

    public LoginPage setPassword(String strPassword){
        this.txtPassword.sendKeys(strPassword);
        return this;
    }

    public void clickOnButtonSubmit(){
        this.btnSubmit.click();
    }
}
