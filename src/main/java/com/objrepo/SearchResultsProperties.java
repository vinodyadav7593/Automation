package com.objrepo;

import org.openqa.selenium.By;

public interface SearchResultsProperties {
	
	By IMG_LOCATOR=By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By ADDTOCARTBUTTON=By.xpath("//p[@id='add_to_cart']/button");
	By FRAME_LOCATOR=By.xpath("//iframe[starts-with(@id,'fancybox-frame')]");
	By SIGNIN_PROCEED_CHECKOUT_LOCATOR=By.xpath("(//a[@title='Proceed to checkout'])[2]");
	By ADDRESS_PROCEED_CHECKOUT=By.xpath("//button[@name='processAddress']");
	By TERMS_OF_SERVICE=By.xpath("//input[@id='cgv']");
	By SHIPPING_PROCEED_CHECKOUT=By.xpath("//button[@name='processCarrier']"); 
	By PAY_BANK_WIRE=By.xpath("//a[@title='Pay by bank wire']");
	By CONFIRM_ORDER=By.xpath("//span[text()='I confirm my order']/..");
	By ORDER_COMPLETE_TXT=By.xpath("//*[text()='Your order on My Store is complete.']");
}
