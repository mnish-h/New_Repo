package easeMyTrip.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easeMyTrip.CommonUtils.commonUtilities;

public class searchFlightPage extends commonUtilities{

	WebDriver driver;
	public searchFlightPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "#FromSector_show")
	WebElement clickOnFromLocation;
	
	@FindBy(css="#a_FromSector_show")
	WebElement clickOnFromLocationField;
	
	@FindBy (xpath="//div[@id='fromautoFill']//div//div[1]")
	WebElement selectFromLocationFromDropdown;
	
	@FindBy (css = "#Editbox13_show")
	WebElement clickOnToLocation;
	
	@FindBy(css="#a_Editbox13_show")
	WebElement clickOnToLocationField;
	
	@FindBy (xpath="//div[@id='toautoFill']//div//div[1]")
	WebElement selectToLocationFromDropdown;
	
	@FindBy (css=".input_cld")
	WebElement departDate;
	
	@FindBy (xpath="//div[@class='box']//div[7]//li[4]")
	WebElement clickOnDate;
	
	@FindBy (css=".srchBtnSe")
	WebElement searchButton;
	
	By fromLocation = By.cssSelector("#FromSector_show");
	
	public void selectFromLocation(String locationFrom) {
		waitForElementToAppear(fromLocation);
		clickOnFromLocation.click();
		clickOnFromLocationField.sendKeys(locationFrom);
		selectFromLocationFromDropdown.click();
	}
	
	public void selectToLocation(String locationTo) {
		clickOnToLocation.click();
		clickOnToLocationField.sendKeys(locationTo);
		selectToLocationFromDropdown.click();
	}
	public void selectDate() {
		departDate.click();
		clickOnDate.click();
	}
	public flightListPage clickonSearchFlighButton() {
		searchButton.click();
		flightListPage listOfFlights = new flightListPage(driver);
		return listOfFlights;
	}
	
	public void goTo() {
		driver.get("https://www.easemytrip.com/");
	}
}
