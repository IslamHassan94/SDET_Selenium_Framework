package com.islam.pages.flightreservations;

import com.islam.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationConfirmationPage extends AbstractPage {
    WebDriver driver;
    private static By gotToFlightsSearchBtnLocator = By.id("go-to-flights-search");

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(gotToFlightsSearchBtnLocator));
        return this.driver.findElement(gotToFlightsSearchBtnLocator).isDisplayed();
    }

    RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void gotoFlightsSearch() {
        this.driver.findElement(gotToFlightsSearchBtnLocator).click();
    }
}
