package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialsearchObj {

	WebDriver driver;
	@FindBy(name="xpath")
	WebElement acceptButton;
	
	@FindBy(name="id")
	WebElement searchField;
	
	public InitialsearchObj(WebDriver driver) {
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
	
}
