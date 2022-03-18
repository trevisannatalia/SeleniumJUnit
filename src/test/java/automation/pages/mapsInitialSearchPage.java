package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mapsInitialSearchPage {
	
	WebDriver driver;
	By acceptButton = By.xpath("//*[@id=\\\"yDmH0d\\\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div/div/button");
	By searchField = By.id("searchboxinput");

	public mapsInitialSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setSearchField(String setValue){
		driver.findElement(acceptButton).sendKeys(setValue);;
	}

	public void clickOnAcceptButton(){
			driver.findElement(acceptButton).click();
	}
	
	public void mapsInitialSearch(String setValue){
		this.setSearchField(setValue);
		this.clickOnAcceptButton();		
	}
}
