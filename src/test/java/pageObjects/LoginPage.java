package pageObjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Utility;

@DefaultUrl("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginPage extends PageObject{
	Utility utility;
	@FindBy(id="loginform-login")
	private WebElement username;
	
	@FindBy(id="loginform-password")
	private WebElement password;
	
	@FindBy(linkText="Forgot password?")
	private WebElement forgotPasswordLink;
	
	@FindBy(id="loginform-rememberme")
	private WebElement rememberMeCheckBox;
	
	@FindBy(css= "button.btn.btn-primary.btn-block")
	private WebElement signInButton;
	
	@FindBy(css= "p a")
	private WebElement didntReceiveConfirmationLink;
	
	@FindBy(css= "div.form-group.field-loginform-password.required.has-error div.help-block")
	private WebElement helpBlock;
	
	public void inputUsername(String username) {
		this.username.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		this.password.sendKeys(password);	
	}
	
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
	
	public void clickDidntReceiveConfirmation() {
		didntReceiveConfirmationLink.click();
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
}
