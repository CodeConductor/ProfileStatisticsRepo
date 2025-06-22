package com.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SkillField extends FormPage{

	public SkillField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return skills.isEnabled();
	}
	public boolean validateSkillWithString() throws NoSuchElementException{
		name.clear();
		skills.clear();
		name.sendKeys("aman");
		skills.sendKeys("PHP");
		submit.click();
		try {
			WebElement result = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='result']")));
			return result.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean validateSkillWithNumber() throws NoSuchElementException{
		name.clear();
		skills.clear();
		name.sendKeys("aman");
		skills.sendKeys("123");
		submit.click();
		try {
			WebElement result = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='result']")));
			return result.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean validateSkillWithSpecialCharacters() throws NoSuchElementException{
		name.clear();
		skills.clear();
		name.sendKeys("aman");
		skills.sendKeys("#");
		submit.click();
		try {
			WebElement result = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='result']")));
			return result.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
}
