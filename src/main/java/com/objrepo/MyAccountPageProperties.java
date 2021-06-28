package com.objrepo;

import org.openqa.selenium.By;

public interface MyAccountPageProperties {

	
	By VIEW_MY_CUSTOMER_ACCOUNT=By.xpath("//a[@title='View my customer account']/span");
	By MY_PERSONAL_INFORMATION=By.xpath("//a[@title='Information']");
	By SEARCH_LOCATOR=By.id("search_query_top");
	By SEARCH_BUTTON=By.name("submit_search");
	
}
