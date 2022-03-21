package automation.stepDefinition;

import automation.pages.TestRunner;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleMapsSearch {
	
	TestRunner testRunner = new TestRunner();

	@Given("I have open the browser")
	public void i_have_open_the_browser() {
		testRunner.setup();
	}

	@Given("I search {string} on Google Maps")
	public void i_search_on_Google_Maps(String placeToSearch) {
		testRunner.initialSearchPage(placeToSearch);
	}

	@Then("Should return {string} on search result")
	public void should_return_on_search_result(String placeToSearch) {
		testRunner.resultDetailPage(placeToSearch);
	}
	
	@And("Should display {string} on destination input clicking on directions")
	public void should_display_on_destination_input(String placeToSearch) {
		testRunner.directionsPage(placeToSearch);
	}
	
	@After
	public void closeBrowser() {
		testRunner.closeBrowser();
	}
}
