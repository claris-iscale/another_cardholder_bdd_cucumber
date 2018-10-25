package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RecoverPasswordPage extends PageObject{
	
	@FindBy(css="h3.panel-title")
	private WebElement header;
	
	@FindBy(id="recoveryform-email")
	private WebElement email;
	
	@FindBy(css="div.form-group.field-recoveryform-email.required.has-error div.help-block")
	private WebElement helpBlock;
	
	@FindBy(css="button.btn.btn-primary.btn-block")
	private WebElement continueButton;
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public String helpBlockValue() {
		return helpBlock.getText();
	}
}
