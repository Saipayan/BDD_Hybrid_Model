package StepDefinitions;

import org.testng.Assert;

import Common.BrowserActionsImpl;
import Common.BrowserActionsInterface;
import Core.WebDriverManagerQA;
import Runner.GenericRunner;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyDtepdefinitionsClass  {

			GenericRunner Runner = new GenericRunner();
			BrowserActionsInterface uiAction = new BrowserActionsImpl(Runner.getDriver());
			
			public Scenario CurrentScenario;
	
			@When("^I wait for (\\d+) milliseconds$")
			public void i_wait_for_milliseconds(int arg1) throws Throwable {
				uiAction.BrowserSleep(arg1);
			}
		
		
			@Given("^I am on the Home Page \"([^\"]*)\"$")
			public void i_am_on_the_Home_Page(String arg1) throws Throwable {
				uiAction.OpenURL(arg1);
			}
			
			@When("^I Enter \"([^\"]*)\" as \"([^\"]*)\"$")
			public void i_Enter_as(String arg1, String arg2) throws Throwable {
			    
			    uiAction.selectFROMdropdownBY_VISIBLETEXT(arg1, arg2);
			}
			
			@When("^I ENter \"([^\"]*)\" as \"([^\"]*)\"$")
			public void i_ENter_as(String arg1, String arg2) throws Throwable {
				uiAction.selectFROMdropdownBY_VISIBLETEXT(arg1, arg2);
			}
			
			
			
			@When("^I move to \"([^\"]*)\" and click the button$")
			public void i_move_to_and_click_the_button(String arg1) throws Throwable {
			    uiAction.MovemouseAndClick(arg1);
			}
			
			
			@Then("^I am in new page$")
			public void i_am_in_new_page() throws Throwable {
			    
				String Title = uiAction.getPageTitle();
				Assert.assertTrue(Title.contains("BMW"));
			}
			

}
