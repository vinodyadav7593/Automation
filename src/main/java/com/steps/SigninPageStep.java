package com.steps;

import cucumber.api.java.en.And;

public class SigninPageStep {

	Steps steps;
	public SigninPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter emailaddress as \"([^\"]*)\"$")
	public void enterEmailAddress(String emailAddress) {
		steps.signinPage.enterEmailAddress(emailAddress);
	}
	
	
	@And("^user click on create account button$")
	public void click_createAccount() {
		steps.createAccountPage=steps.signinPage.clickCreateAccountButton();
	}
	
	@And("^user enter username as \"([^\"]*)\"$")
	public void enter_Login_EmailAddress(String userName) {
		steps.signinPage.enterLoginEmailaddress(userName);
	}
	
	@And("^user enter login password as \"([^\"]*)\"$")
	public void enter_Login_Password(String password) {
		steps.signinPage.enterLoginPassword(password);
	}
	
	@And("^user click on login button$")
	public void clickLoginButton() {
		steps.myAccountPage=steps.signinPage.clickLogin();
	}
}
