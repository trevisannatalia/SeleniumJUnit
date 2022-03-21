package automation.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
	
	WebDriver driver;
	InitialSearchPage initialSearchPage;
	ResultDetailPage resultDetailPage;
	DirectionsPage directionsPage;
	
	@Before
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
	}

	@Test
	//RUN AS JUnit
	public void search_by_Dublin() {
		String placeToSearch = "Dublin";
		
		initialSearchPage(placeToSearch);
		resultDetailPage(placeToSearch);
		directionsPage(placeToSearch);
		
	}
	
	public void initialSearchPage(String placeToSearch) {	
		initialSearchPage = new InitialSearchPage(driver);
		initialSearchPage.mapsInitialSearch(placeToSearch);
	}
	
	public void resultDetailPage(String placeToSearch) {
		resultDetailPage = new ResultDetailPage(driver);
		assertEquals(resultDetailPage.getPlaceTitle(), placeToSearch);
	}
	
	public void directionsPage(String placeToSearch) {
		directionsPage = new DirectionsPage(driver);
		assertTrue((directionsPage.directionsPage()).contains(placeToSearch));
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
