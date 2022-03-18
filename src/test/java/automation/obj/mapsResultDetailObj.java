package automation.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mapsResultDetailObj {

	WebDriver driver;
	@FindBy(name="xpath")
	WebElement placeTitle;
	
	@FindBy(name="xpath")
	WebElement weather;
}
