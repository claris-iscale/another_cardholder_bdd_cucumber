package stepDefinition;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RequestConfirmationStep;
import utils.Constants;

public class RequestConfirmationStepDefinition {
	
	@Steps
	RequestConfirmationStep requestConfirmationStep;
	
	//^I check an error "Email cannot be blank." should be displayed
	@Then("^I check an error \"Email cannot be blank.\" should be displayed - request confirmation page$")
	public void check_error_message_should_be_displayed() throws Throwable{
		String helpBlockValue = requestConfirmationStep.get_help_block_value();
		String errorMessage = Constants.EMAIL_CANNOT_BE_BLANK;
		System.out.print("Now is step: "+ "An error "+errorMessage+" should be displayed");
		System.out.print("Expected error message is: "+"["+errorMessage+"]");
		System.out.print("Actual error message is  : "+"["+helpBlockValue+"]");
		assertTrue(errorMessage.equalsIgnoreCase(helpBlockValue));
	}
	
	//I Click Continue button - request confirmation page
	@When("^I Click Continue button - request confirmation page$")
	public void click_continue_button( ) throws Throwable{
		System.out.println("Now in step: "+ "I Click Continue button - request confirmation page");
		requestConfirmationStep.click_continue_button();
	}
}
