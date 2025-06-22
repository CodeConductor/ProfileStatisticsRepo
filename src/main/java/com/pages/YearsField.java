package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class YearsField extends FormPage{

	public YearsField(WebDriver driver) {
		super(driver);
	}
	public boolean isEnabled() {
		return yoe.isEnabled();
	}
	public boolean isMandatory() throws NoAlertPresentException{
		name.sendKeys("aman");
		submit.click();
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
	}
}
