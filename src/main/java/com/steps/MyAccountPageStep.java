package com.steps;

import org.junit.Assert;

import cucumber.api.java.en.And;

public class MyAccountPageStep {

	Steps steps;

	public MyAccountPageStep(Steps steps) {
		this.steps=steps;
	}

	@And("^verify new account created \"([^\"]*)\"$")
	public void verifyUserDetails(String accountDetails) {
		Assert.assertEquals(accountDetails,steps.myAccountPage.getCustomerAccountName());
	}
	
	@And("^user click on my perosnal information$")
	public void click_MY_Personal_Information() {
		steps.personalInformationPage=steps.myAccountPage.clickOnMyPersonalInformation();
	}
	
	@And("^user should see first name updated \"([^\"]*)\"$")
	public void updatedUserDeatils(String updatedAccountDetails) {
		Assert.assertEquals(updatedAccountDetails,steps.myAccountPage.getCustomerAccountName());
	}
	
	@And("^user enter item \"([^\"]*)\" in the search box$")
	public void enterItem(String item) {
		steps.myAccountPage.enterIteam(item);
	}
	
	@And("^user click on search button$")
	public void clickSearchButton() {
		steps.searchResultsPage=steps.myAccountPage.clickSearchButton();
	}
	
	
}
