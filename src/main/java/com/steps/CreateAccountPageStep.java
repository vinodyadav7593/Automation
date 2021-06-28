package com.steps;

import cucumber.api.java.en.And;

public class CreateAccountPageStep {

	Steps steps;
	public CreateAccountPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter firstname as \"([^\"]*)\"$")
	public void enter_firstname(String firstName) {
		steps.createAccountPage.enterFirstName(firstName);
	}
	@And("^user enter lastname as \"([^\"]*)\"$")
	public void enter_lastName(String lastName) {
		steps.createAccountPage.enterLastName(lastName);
	}
	@And("^user enter password as \"([^\"]*)\"$")
	public void enter_password(String password) {
		steps.createAccountPage.enterPassword(password);
	}
	@And("^user enter address as \"([^\"]*)\"$")
	public void enter_addres(String address) {
		steps.createAccountPage.enterAddress(address);
	}
	@And("^user enter city as \"([^\"]*)\"$")
	public void enter_city(String city) {
		steps.createAccountPage.enterCity(city);
	}
	@And("^user select state as \"([^\"]*)\"$")
	public void selectState(String state) {
		steps.createAccountPage.selectState(state);
	}
	@And("^user enter postalcode as \"([^\"]*)\"$")
	public void enter_postalCode(String postalCode) {
		steps.createAccountPage.enterPostalCode(postalCode);
	}
	@And("^user enter phonenumber as \"([^\"]*)\"$")
	public void enter_phoneNumber(String phoneNumber) {
		steps.createAccountPage.enterPhoneNumber(phoneNumber);
	}
	@And("^user enter alias as \"([^\"]*)\"$")
	public void enter_alias(String alias) {
		steps.createAccountPage.enterAlias(alias);
	}
	
	@And("^user click register button$")
	public void click_register() {
		steps.myAccountPage=steps.createAccountPage.clickRegisterButton();
	}
	
}
