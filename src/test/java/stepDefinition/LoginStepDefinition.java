package stepDefinition;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import steps.RecoverPasswordStep;
import utils.Utility;
public class LoginStepDefinition{
	@Steps
	LoginStep loginStep;
	RecoverPasswordStep recoverPasswordStep;
	
	Utility utility;
	WebDriver driver = null ;
	
	//I navigate to Login Page
	@Given("^I navigate to Login Page$")
	public void user_is_on_Home_Page() throws Throwable {
		loginStep.open_login_page();
		}
	
	//I Close the browser
	@Then("^I Close the browser$")
	public void user_close_the_browser() throws Throwable{
		loginStep.close_browser();
	}
	
	//I enters username and password
	@When("^I enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		loginStep.input_username_and_password(username, password);
	}
	
	//I click forgot password
	@When("^I click forgot password$")
	public void click_forgot_password( ) throws Throwable{
		System.out.println("Now in step: "+ "forgot password button");
		loginStep.click_forgot_password();
	}
	
	//I Click Didn't receive confirmation message?" link
	@And("^Click Didn't receive confirmation message?\" link$")
	public void click_didnt_receive_confirmation_button() throws Throwable{
		System.out.println("Now is step: "+ "I Click Didn't receive confirmation message?\" link");
		loginStep.click_didnt_receive_confirmation_link();
	}
	
	//I click Sign in button
	@And("^I click Sign in button$")
	public void click_sign_in_button() throws Throwable{
		loginStep.click_sign_in_button();
		Thread.sleep(1000);
	}
	
}