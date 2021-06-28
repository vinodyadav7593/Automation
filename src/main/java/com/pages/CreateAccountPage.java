package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.objrepo.CreateAccountPageProperties;
import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;


	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterFirstName(String firstName) {
		enterText(FIRSTNAME_LOCATOR, firstName);
	}

	public void enterLastName(String lastName) {
		//driver.findElement(By.id("customer_lastname")).sendKeys("manoj");
		enterText(LASTNAME_LOCATOR, lastName);
	}

	public void enterPassword(String password) {

		enterText(PASSWORD_LOCATOR, password);
	}

	public void enterAddress(String address) {
		enterText(ADDRESS_LOCATOR, address);
	}

	public void enterCity(String city) {
		enterText(CITY_LOCATOR, city);
	}

	public void selectState(String state) {
		selectValueFromDropDown(STATE_LOCATOR, state);
	}

	public void enterPostalCode(String postalcode) {
		enterText(POSTALCODE_LOCATOR,postalcode);
	}

	public void enterPhoneNumber(String phoneNumber) {
		enterText(MOBILENUMBER_LOCATOR,phoneNumber);
	}

	public void enterAlias(String alias) {
		enterText(ALIAS_LOCATOR,alias);
	}

	public MyAccountPage clickRegisterButton() {
		click(REGISTERBUTTON_LOCATOR);
		return new MyAccountPage(driver);
	}

}

