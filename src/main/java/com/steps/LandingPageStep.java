package com.steps;

import com.util.Setup;
import com.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LandingPageStep {

	
	Steps steps;
	
	public LandingPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@Given("^user launch browser$")
	public void user_launch_browser() {
		steps.testBase=new TestBase();
		steps.testBase.initilizeDriver();
	}
	
	@When("^user enter url$")
	public void enter_url() {
		steps.landingPage=steps.testBase.enterURL(Setup.AUTOMATION_URL);
	}
	
	@And("^user click on signin link$")
	public void click_on_signin() {
		steps.signinPage=steps.landingPage.clickSignin();
	}
	
	
	
}
