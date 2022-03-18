package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultDetailObj {

	WebDriver driver;
	@FindBy(name="xpath")
	WebElement placeTitle;

	public ResultDetailObj(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPlaceTitle() {
		return placeTitle;
	}

}
