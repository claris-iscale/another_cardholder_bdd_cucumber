package utils;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Utility extends PageObject{
	
	 public void enterText(WebElement element, String value) {
		 element.sendKeys(value);
	 }
	 
	 public String get_page_title() {
		 return getDriver().getTitle();
	 }
	 
	 public void go_back_to_previous_page() {
		getDriver().navigate().back();
	 }
}
