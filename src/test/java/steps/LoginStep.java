package steps;

import net.thucydides.core.annotations.At;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.LoginPage;

@At("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginStep extends ScenarioSteps{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	public void input_username_and_password(String username, String password) {
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
	}
	public void open_login_page() {
		getDriver().manage().window().maximize();
		loginPage.open();
	}
	public void close_browser() {
		getDriver().quit();
	}
	public void click_forgot_password() {
		loginPage.clickForgotPassword();
	}
	public void click_didnt_receive_confirmation_link() {
		loginPage.clickDidntReceiveConfirmation();
	}
	public void click_sign_in_button() {
		loginPage.clickSignInButton();
	}
}
