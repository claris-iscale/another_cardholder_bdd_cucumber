package stepDefinition;

import static org.junit.Assert.assertTrue;

import utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RecoverPasswordPage;
import net.thucydides.core.annotations.Steps;
import steps.RecoverPasswordStep;
import utils.Utility;

public class RecoverPasswordStepDefinition {
	
	Utility utility;

	@Steps
	RecoverPasswordStep recoverPasswordStep;
	
	//I Click Continue button 
	@When("^I Click Continue button$")
	public void click_continue_button( ) throws Throwable{
		System.out.print("Now in step: "+ "I Click Continue button");
		recoverPasswordStep.click_continue_button();
	}
	
	//^I check an error "Email cannot be blank." should be displayed
	@Then("^I check an error \"Email cannot be blank.\" should be displayed$")
	public void check_error_message_should_be_displayed() throws Throwable{
		String helpBlockValue = recoverPasswordStep.help_block_value();
		String errorMessage = Constants.EMAIL_CANNOT_BE_BLANK;
		System.out.print("Now is step: "+ "An error "+errorMessage+" should be displayed");
		System.out.print("Expected error message is: "+"["+errorMessage+"]");
		System.out.print("Actual error message is  : "+"["+helpBlockValue+"]");
		assertTrue(errorMessage.equalsIgnoreCase(helpBlockValue));
	}
}
