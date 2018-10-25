package steps;

import pageObjects.RequestConfirmationPage;

public class RequestConfirmationStep {
	RequestConfirmationPage requestConfirmationPage ;
	public void click_continue_button() {
		requestConfirmationPage.clickContinueButton();
	}
	
	public String get_help_block_value() {
		return requestConfirmationPage.helpBlockValue();
	}
}
