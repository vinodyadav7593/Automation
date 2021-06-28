package com.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterEmailAddress(String emailAddress) {
		enterText(EMAIlADDRESS_LOCATOR, emailAddress);
	}

	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNT_LOCATOR);
		return new CreateAccountPage(driver);
	}
	
	public void enterLoginEmailaddress(String userName) {
		enterText(LOGIN_EMAILADDRESS, userName);
	}
	public void enterLoginPassword(String password) {
		enterText(LOGIN_PASSWORD, password);
	}
	
	public MyAccountPage clickLogin() {
		click(LOGIN_BUTTON);
		return new MyAccountPage(driver);
	}
}
