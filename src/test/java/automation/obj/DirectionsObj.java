package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectionsObj {
	
	WebDriver driver;
	@FindBy(name="xpath")
	WebElement directionsIcon;
	
	@FindBy(name="xpath")
	WebElement destinationInput;

	public DirectionsObj(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnDirectionsIcon() {
		directionsIcon.click();
	}

	public String getDestinationInput() {
		return destinationInput.getAttribute("value");
	}
}
