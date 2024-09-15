package com.islam.pages.flightreservations;

import com.islam.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchPage extends AbstractPage {
    private static By passengerSelectLocator = By.id("passengers");
    private static By searchFlightsButtonLocator = By.id("search-flights");


    public FlightSearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(passengerSelectLocator));
        return this.driver.findElement(passengerSelectLocator).isDisplayed();
    }

    public void selectPassengers(String noOfPassengers) {
        WebElement passengersSelect = this.driver.findElement(passengerSelectLocator);
        Select passengers = new Select(passengersSelect);
        passengers.selectByValue(noOfPassengers);
    }

    public void searchFlights() {
        this.driver.findElement(searchFlightsButtonLocator).click();
    }
}
