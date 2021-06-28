package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);
	}
	
	public void selectValueFromDropDown(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);
	}
	
	public void selectValueFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
	
	public String getText(By prop) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).getText();
	}
	
	public void doMouseHover(By prop) {
		Actions builder=new Actions(driver);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		builder.moveToElement(driver.findElement(prop)).build().perform();
	}
	
	public void clickUsingJavaScript(By prop) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(prop));
	}
	
	public void clickUsingActions(By prop) {
		
		Actions builder=new Actions(driver);
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(prop));
		builder.moveToElement(driver.findElement(prop)).click().build().perform();
	}
	public void clickUsingSubmit(By prop) {
		
		driver.findElement(prop).submit();
	}
	
	public void selectFrame(By prop) {
		driver.switchTo().frame(driver.findElement(prop));
	}
	
	public void pageScroll() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");

	}
	
	public boolean isElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}
}
