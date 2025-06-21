package com.pages;

import org.openqa.selenium.WebDriver;

public class AppsField extends FormPage {

	public AppsField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return apps.isEnabled();
	}
	public boolean validateAppWithNumbers() {
		name.sendKeys("aman");
		apps.sendKeys("1");
		submit.click();
		return result.isDisplayed();
	}

	public boolean validateAppWithStrings() {
		name.sendKeys("aman");
		apps.sendKeys("one");
		submit.click();
		return result.isDisplayed();
	}
	
	public boolean validateAppWithSpecialCharacters() {
		name.sendKeys("aman");
		apps.sendKeys("o@1");
		submit.click();
		return result.isDisplayed();
	}
}
