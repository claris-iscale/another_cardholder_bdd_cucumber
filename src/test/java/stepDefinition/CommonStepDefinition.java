package stepDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Utility;

public class CommonStepDefinition {
	Utility utility;
	//I go back previous Page
	@When("^I go back previous Page$")
	public void click_continue_button( ) throws Throwable{
		System.out.print("Now in step: "+ "I go back previous Page");
		utility.go_back_to_previous_page();
	}
	
	//I check page is displayed
		@Then("^I check \"(.*)\" page is displayed$")
		public void page_title_is_displayed(String pageTitle) throws Throwable{
			System.out.print("Now in step: "+ pageTitle+ " page is displayed");
			String currentPageTitle = utility.get_page_title();
			System.out.print("Expected page title is: "+"["+pageTitle+"]");
			System.out.print("Actual page title is  : "+"["+currentPageTitle+"]");
			assertTrue(pageTitle.equals(currentPageTitle));
		}
}
