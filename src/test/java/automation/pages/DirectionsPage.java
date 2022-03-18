package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectionsPage {

	WebDriver driver;
	By directionsIcon = By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[4]/div[1]/button/span");
	By destinationInput = By.xpath("//*[@id=\"sb_ifc52\"]/input");

	public DirectionsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnDirectionsIcon() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(directionsIcon)).click();
	}

	public String getDestinationInput() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(destinationInput))
				.getAttribute("value");

	}

	public String directionsPage() {
		this.clickOnDirectionsIcon();
		return this.getDestinationInput();
	}

}
