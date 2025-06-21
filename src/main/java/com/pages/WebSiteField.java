package com.pages;

import org.openqa.selenium.WebDriver;

public class WebSiteField extends FormPage{

	public WebSiteField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return websites.isEnabled();
	}
	public boolean validateWebsiteWithNumbers() {
		name.sendKeys("aman");
		websites.sendKeys("5");
		submit.click();
		return result.isDisplayed();
	}
	public boolean validateWebsiteWithStrings() {
		name.sendKeys("aman");
		websites.sendKeys("Jane Doe");
		submit.click();
		return result.isDisplayed();
	}
	public boolean validateWebsiteWithSpecialCharacters() {
		name.sendKeys("aman");
		websites.sendKeys(".");
		submit.click();
		return result.isDisplayed();
	}
}
