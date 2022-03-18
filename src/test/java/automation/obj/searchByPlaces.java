package automation.obj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchByPlaces {
	WebDriver driver;

	@Before
	public void abreBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
		// Consent Button
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div/div/button"))
				.click();
	}

	@Test
	public void searchByDublin() throws InterruptedException {

		String placeToSearch = "Dublin";

		driver.findElement(By.id("searchboxinput")).sendKeys(placeToSearch);
		driver.findElement(By.id("searchboxinput")).sendKeys(Keys.ENTER);

		titleValidation(placeToSearch);
		weatherValidation(placeToSearch);
		directionsValidation(placeToSearch);
		urlValidation(placeToSearch);
	}

	void titleValidation(String placeToSearch) {
		String titleValidation = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/h1/span[1]")))
				.getText();
		assertEquals(titleValidation, placeToSearch);
	}
	
	void urlValidation(String placeToSearch) {
		boolean titleValidation = driver.getCurrentUrl().contains(placeToSearch);
		assertTrue(titleValidation);
	}

	void directionsValidation(String placeToSearch) {
		driver.findElement(By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[4]/div[1]/button/span")).click();
		String directionsValidation = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sb_ifc52\"]/input")))
				.getAttribute("value");
		assertTrue((directionsValidation).contains(placeToSearch));
	}
	
	void weatherValidation(String placeToSearch) {
		String weatherValidation = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/a")))
				.getAttribute("aria-label");
		assertTrue((weatherValidation).contains(placeToSearch));
	}

	@After
	public void fechaBrowser() {
		driver.quit();
	}
}
