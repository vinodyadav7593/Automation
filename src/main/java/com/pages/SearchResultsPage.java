package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.SearchResultsProperties;
import com.util.WebDriverUtils;

public class SearchResultsPage extends WebDriverUtils implements SearchResultsProperties{


	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickOnImage() {
		click(IMG_LOCATOR);
	}
	
	public void click_AddToCart() {
		selectFrame(FRAME_LOCATOR);
		clickUsingSubmit(ADDTOCARTBUTTON);
	}
	
	public void click_ProceedToCheckut_Signin() {
		click(SIGNIN_PROCEED_CHECKOUT_LOCATOR);
	}
	
	public void click_ProceedToCheckut_Address() {
		pageScroll();
		click(ADDRESS_PROCEED_CHECKOUT);
	}
	
	public void click_TermsOfService() {
		pageScroll();
		clickUsingJavaScript(TERMS_OF_SERVICE);
	}
	
	public void click_ProceedToCheckut_Shipping() {
		pageScroll();
		click(SHIPPING_PROCEED_CHECKOUT);
	}
	
	public void clickOnpayBankWire() {
		pageScroll();
		click(PAY_BANK_WIRE);
	}
	
	public void clickConfirmOrder() {
		pageScroll();
		click(CONFIRM_ORDER);
	}
	
	public boolean verifyConfirmOrderTextPresent() {
		return isElementPresent(ORDER_COMPLETE_TXT);
	}
	
}
