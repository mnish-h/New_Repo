package TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import easeMyTrip.pageObjects.searchFlightPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	public WebDriver initializeDriver() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	
	public searchFlightPage launchApplication() {
		driver = initializeDriver();
		searchFlightPage flightHomePage = new searchFlightPage(driver);
		flightHomePage.goTo();
		return flightHomePage;
	}
}
