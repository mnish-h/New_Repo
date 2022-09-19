package easeMyTripTestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestComponents.BaseTest;
import easeMyTrip.pageObjects.flightListPage;
import easeMyTrip.pageObjects.searchFlightPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selectCheapestFlight extends BaseTest{
		
		@Test
		public void selectFlightCheap() throws InterruptedException {
			String fromLocation = "Bangalore";
			String toLocation = "Delhi";
			searchFlightPage flightHomePage = launchApplication();
			flightHomePage.selectFromLocation(fromLocation);
			flightHomePage.selectToLocation(toLocation);
			flightHomePage.selectDate();
			flightListPage listOfFlights = flightHomePage.clickonSearchFlighButton();
			listOfFlights.clickOnBookingForCheapestFlight();
			
		}		
}
