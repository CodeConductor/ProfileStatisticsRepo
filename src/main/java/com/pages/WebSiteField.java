package com.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebSiteField extends FormPage {

	public WebSiteField(WebDriver driver) {
		super(driver);
	}

	public boolean isEnabled() {
		return websites.isEnabled();
	}

	public boolean isMandatory() throws NoAlertPresentException {
		name.sendKeys("aman");
		websites.sendKeys("");
		submit.click();
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public boolean validateWebsiteWithNumbers() throws NoSuchElementException{
		name.clear();
		websites.clear();
		name.sendKeys("aman");
		websites.sendKeys("5");
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

	public boolean validateWebsiteWithNegativeNumbers() throws NoSuchElementException{
		name.clear();
		websites.clear();
		name.sendKeys("aman");
		websites.sendKeys("-5");
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

	public boolean validateWebsiteWithStrings() throws NoSuchElementException{
		name.clear();
		websites.clear();
		name.sendKeys("aman");
		websites.sendKeys("Jane Doe");
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

	public boolean validateWebsiteWithSpecialCharacters() throws NoSuchElementException{
		name.clear();
		websites.clear();
		name.sendKeys("aman");
		websites.sendKeys(".");
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
