package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mapsInitialsearchObj {

	WebDriver driver;
	@FindBy(name="xpath")
	WebElement acceptButton;
	
	@FindBy(name="id")
	WebElement searchField;
	
	public mapsInitialsearchObj(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public void acceptButton() {
		acceptButton.click();
	}

	public void setSearchField(String setValue) {
		searchField.sendKeys(setValue);
	}
	
	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param acceptButton
	 * @param setSearchField
	 * @return
	 */
	public void mapsInitialsearch(String searchPlace){
		//Fill user name
		this.acceptButton();
		//Fill password
		this.setSearchField(searchPlace);
	}
	
}
