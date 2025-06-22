package com.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppsField extends FormPage {

	public AppsField(WebDriver driver) {
		super(driver);
	}

	public boolean isEnabled() {
		return apps.isEnabled();
	}

	public boolean isMandatory() throws NoAlertPresentException {
		name.clear();
		apps.clear();
		name.sendKeys("aman");
		apps.sendKeys("");
		submit.click();
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public boolean validateAppWithNumbers() throws NoSuchElementException{
		name.clear();
		apps.clear();
		name.sendKeys("aman");
		apps.sendKeys("1");
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

	public boolean validateAppWithNegativeNumbers() throws NoSuchElementException{
		name.clear();
		apps.clear();
		name.sendKeys("aman");
		apps.sendKeys("-1");
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

	public boolean validateAppWithStrings() throws NoSuchElementException{
		name.clear();
		apps.clear();
		name.sendKeys("aman");
		apps.sendKeys("one");
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

	public boolean validateAppWithSpecialCharacters() throws NoSuchElementException{
		name.clear();
		apps.clear();
		name.sendKeys("aman");
		apps.sendKeys("o@1");
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
