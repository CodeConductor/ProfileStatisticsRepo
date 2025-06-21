package com.pages;

import org.openqa.selenium.WebDriver;

public class SkillField extends FormPage{

	public SkillField(WebDriver driver) {
		super(driver);
	}
	
	public boolean validateSkillWithString() {
		name.sendKeys("aman");
		skills.sendKeys("PHP");
		submit.click();
		return result.isDisplayed();
	}
	public boolean validateSkillWithNumber() {
		name.sendKeys("aman");
		skills.sendKeys("123");
		submit.click();
		return result.isDisplayed();
	}
	public boolean validateSkillWithSpecialCharacters() {
		name.sendKeys("aman");
		skills.sendKeys("C#");
		submit.click();
		return result.isDisplayed();
	}
}
