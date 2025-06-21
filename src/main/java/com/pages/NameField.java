package com.pages;

import org.openqa.selenium.WebDriver;

public class NameField extends FormPage{

	public NameField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return name.isEnabled();
	}
	public boolean validateNamewithString() {
		name.sendKeys("Jane Doe");
		submit.click();
		return resultName.isDisplayed();
	}
	public boolean validateNamewithNumbers() {
		name.sendKeys("1234");
		submit.click();
		return resultName.isDisplayed();
	}
	public boolean withSpecialCharacters() {
		name.sendKeys("aman@123");
		submit.click();
		return resultName.isDisplayed();
	}
}
