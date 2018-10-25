package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class RequestConfirmationPage extends PageObject{
	
	@FindBy(css = "h3.panel-title")
	private WebElement header;
	
	@FindBy(id = "resendform-email")
	private WebElement email;
	
	@FindBy(css = "div.form-group.field-resendform-email.required.has-error div.help-block")
	private WebElement helpBlock;
	
	@FindBy(css = "button.btn.btn-primary.btn-block")
	private WebElement continueButton;
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public String helpBlockValue() {
		return helpBlock.getText();
	}
}
