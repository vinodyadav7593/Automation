package com.steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchResultsStep {

	Steps steps;
	
	public SearchResultsStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user click on image$")
	public void click_image() {
		steps.searchResultsPage.clickOnImage();
	}
	
	@And("^user click on add to cart button$")
	public void click_AddToCart() {
		steps.searchResultsPage.click_AddToCart();
	}
	@And("^user click on proceed to check out option in signin tab$")
	public void click_ProceedToCheckout_SigninTab() {
		steps.searchResultsPage.click_ProceedToCheckut_Signin();
	}
	
	@And("^user click on proceed to check out option in address tab$")
	public void click_ProcedtoCheck_AddressTab() {
		
		steps.searchResultsPage.click_ProceedToCheckut_Address();
	}
	
	@And("^user click on terms of service check box$")
	public void checkTermofService() {
		steps.searchResultsPage.click_TermsOfService();
	}
	
	@And("^user click on proceed to check out option in shipping tab$")
	public void click_ProcedtoCheck_ShippingTab() {
		steps.searchResultsPage.click_ProceedToCheckut_Shipping();
	}
	
	@And("^user click on paybankwire option$")
	public void clickOnPayBankWire() {
		steps.searchResultsPage.clickOnpayBankWire();
	}
	
	@And("^user click on confirm order option$")
	public void clickConfirmOrder() {
		steps.searchResultsPage.clickConfirmOrder();
	}
	
	@Then("^user should see order placed succesfully$")
	public void verifyOrderText() {
		Assert.assertTrue(steps.searchResultsPage.verifyConfirmOrderTextPresent());
	}
}
