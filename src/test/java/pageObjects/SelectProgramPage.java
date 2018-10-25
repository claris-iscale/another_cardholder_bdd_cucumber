package pageObjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class SelectProgramPage extends PageObject{
	
	@FindBy(css = "h1")
	private WebElement header;
	
	@FindBy(name = "program")
	private WebElement selectProgramDropdown;
	
	@FindBy(css = "button.btn.btn-primary:nth-child(1)")
	private WebElement submitButton;
	
	@FindBy(css = "span.card-status.verified")
	private WebElement cardStatus;
	
	@FindBy(css = "a#lnk-account-settings")
	private WebElement accountSettings;
	
	@FindBy(css = "a.gravatar")
	private WebElement accountAvatar;
	
	@FindBy(css = "ul#w0.nav.navbar-nav.navbar-right a")
	private WebElement logoutLink;
	
	@FindBy(css = "img.another-logo")
	private WebElement logo;
	
	
}
