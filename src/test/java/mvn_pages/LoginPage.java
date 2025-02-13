package mvn_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
    WebDriver ldriver;
 
    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this); 
    }
    
    @FindBy(name="uid")
    WebElement txtUserName;
 
    @FindBy(name="password")
    WebElement txtPassword;
 
    @FindBy(name="btnLogin")
    WebElement btnLogin;
 
    public void setUsername(String uname) {
        txtUserName.sendKeys(uname);
    }
 
    public void setPassword(String password) {
        txtPassword.sendKeys(password);
    }
 
    public void clickSubmit() {
        btnLogin.click();
    }
}
