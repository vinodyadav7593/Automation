package com.steps;

import cucumber.api.java.en.And;

public class PerosnalInformationStep {

	Steps steps;
	public PerosnalInformationStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user edit firstname as \"([^\"]*)\"$")
	public void enter_edit_firstname(String editFirstName) {
		steps.personalInformationPage.editFirstName(editFirstName);
	}
	@And("^user enter current password as \"([^\"]*)\"$")
	public void enter_password(String password) {
		steps.personalInformationPage.enterCurrentPassword(password);
	}
	@And("^user click on save button$")
	public void clickSave() {
		steps.personalInformationPage.clickSave();
	}
}
