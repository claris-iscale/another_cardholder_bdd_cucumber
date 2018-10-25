package steps;

import pageObjects.RecoverPasswordPage;

public class RecoverPasswordStep {
	RecoverPasswordPage recoverPasswordPage;
	public void click_continue_button() {
		recoverPasswordPage.clickContinueButton();
	}
	public String help_block_value() {
		return recoverPasswordPage.helpBlockValue();
	}
}
