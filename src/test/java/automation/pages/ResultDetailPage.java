package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultDetailPage {

	WebDriver driver;
	By placeTitle = By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/h1/span[1]");

	public ResultDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPlaceTitle() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(placeTitle)).getText();

	}

}
