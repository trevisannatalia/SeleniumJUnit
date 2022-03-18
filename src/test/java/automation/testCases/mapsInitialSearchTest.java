package automation.testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.pages.mapsDirectionsPage;
import automation.pages.mapsInitialSearchPage;
import automation.pages.mapsResultDetailPage;

public class mapsInitialSearchTest {
	
	WebDriver driver;
	mapsInitialSearchPage searchObj;
	mapsResultDetailPage detailObj;
	mapsDirectionsPage directionsObj;
	
	@Before
	public void setup(){		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
	}

	@Test
	public void test_Home_Page_Appear_Correct(){
		searchObj = new mapsInitialSearchPage(driver);	
		System.out.println("###################### foi");
		//assertTrue(searchObj.getSearchField().getText().contains("Dublin"));
	}
	
	@After
	public void fechaBrowser() {
		driver.quit();
	}

}
