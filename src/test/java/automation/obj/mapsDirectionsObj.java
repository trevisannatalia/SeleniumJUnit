package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mapsDirectionsObj {
	
	WebDriver driver;
	@FindBy(name="xpath")
	WebElement originField;
	
	@FindBy(name="xpath")
	WebElement destinationField;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOriginField() {
		return originField;
	}

	public void setOriginField(WebElement originField) {
		this.originField = originField;
	}

	public WebElement getDestinationField() {
		return destinationField;
	}

	public void setDestinationField(WebElement destinationField) {
		this.destinationField = destinationField;
	}

}
