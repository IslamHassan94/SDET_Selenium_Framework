package com.islam.pages.flightreservations;

import com.islam.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends AbstractPage {

    private WebDriver driver;
    private static By firstNameLocator = By.id("firstName");
    private static By lastNameLocator = By.id("lastName");
    private static By emailLocator = By.id("email");
    private static By passwordLocator = By.id("password");
    private static By streetLocator = By.id("street");
    private static By cityLocator = By.id("city");
    private static By zipLocator = By.id("zip");

    private static By registerButtonLocator = By.id("register-btn");

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLocator));
        return this.driver.findElement(firstNameLocator).isDisplayed();
    }

    RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void goTo(String url) {
        this.driver.get(url);
    }

    public void enterUserDetails(String firstName, String lastName) {
        this.driver.findElement(firstNameLocator).sendKeys(firstName);
        this.driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public void enterUserCredentials(String username, String password) {
        this.driver.findElement(emailLocator).sendKeys(username);
        this.driver.findElement(passwordLocator).sendKeys(password);
    }

    public void enterAddress(String street, String city, String zip) {
        this.driver.findElement(streetLocator).sendKeys(street);
        this.driver.findElement(cityLocator).sendKeys(city);
        this.driver.findElement(zipLocator).sendKeys(zip);
    }

    public void register() {
        this.driver.findElement(registerButtonLocator).click();
    }
}
