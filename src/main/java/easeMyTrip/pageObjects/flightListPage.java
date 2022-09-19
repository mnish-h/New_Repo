package easeMyTrip.pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easeMyTrip.CommonUtils.commonUtilities;

public class flightListPage extends commonUtilities{

	WebDriver driver;
	public flightListPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Book Now']")
	WebElement flighPrice;
	
	By bookPrice = By.xpath("//button[text()='Book Now']");
	
	public void clickOnBookingForCheapestFlight() {
		waitForElementToAppear(bookPrice);
		flighPrice.click();
	}
	
}
