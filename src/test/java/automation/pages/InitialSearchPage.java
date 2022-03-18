package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitialSearchPage {

	WebDriver driver;
	By acceptButton = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div/div/button");
	By searchField = By.id("searchboxinput");
	By pressEnter = By.id("searchboxinput");

	public InitialSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setSearchField(String setValue) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(searchField))
				.sendKeys(setValue);
	}

	public void clickOnAcceptButton() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(acceptButton)).click();
	}

	public void clickOnEnter() {
		driver.findElement(pressEnter).sendKeys(Keys.ENTER);
	}

	public void mapsInitialSearch(String setValue) {
		this.clickOnAcceptButton();
		this.setSearchField(setValue);
		this.clickOnEnter();
	}
}
