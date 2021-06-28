package com.pages;


import org.openqa.selenium.WebDriver;

import com.objrepo.PersonalInformationProperties;
import com.util.WebDriverUtils;

public class PersonalInformationPage extends WebDriverUtils implements PersonalInformationProperties{

	WebDriver driver;
	
	public PersonalInformationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void editFirstName(String editFirstName) {
		enterText(FIRSTNAME_LOCATOR, editFirstName);
	}
	public void enterCurrentPassword(String password) {
		enterText(PASSWORD_LOCATOR, password);
	}
	public MyAccountPage clickSave() {
		click(SAVE_BUTTON);
		return new MyAccountPage(driver);
	}
}

