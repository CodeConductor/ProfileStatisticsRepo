package com.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NameField extends FormPage{

	public NameField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return name.isEnabled();
	}
	public boolean isMandatory() throws NoAlertPresentException{
		name.sendKeys("");
		submit.click();
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
	}
	public boolean validateNamewithString() throws NoSuchElementException{
		name.clear();
		name.sendKeys("Jane Doe");
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
	public boolean validateNamewithNumbers() throws NoSuchElementException{
		name.clear();
		name.sendKeys("1234");
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
	public boolean withSpecialCharacters() throws NoSuchElementException{
		name.clear();
		name.sendKeys("aman@123");
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
