package com.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
	WebDriver driver;
	WebDriverWait wait;
	Select s;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement name;

	@FindBy(xpath = "//select[@id='experience']")
	WebElement yoe;

	@FindBy(xpath = "//input[@id='skills']")
	WebElement skills;

	@FindBy(xpath = "//input[@id='websites']")
	WebElement websites;

	@FindBy(xpath = "//input[@id='apps']")
	WebElement apps;

	@FindBy(xpath = "//button[@id='measureBtn']")
	WebElement submit;

	@FindBy(xpath = "//div[@id='result']")
	WebElement result;

	@FindBy(xpath = "//div[@id='result']/h2")
	WebElement resultName;

	@FindBy(xpath = "//div[@class='header']/h1")
	WebElement header;

	@FindBy(xpath = "//img[@alt='user']")
	WebElement img;

	public boolean isHeaderVisible() {
		return header.isDisplayed();
	}

	public boolean cardDisplayedAfterSubmit() throws NoSuchElementException{
		name.sendKeys("aman");
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

	public boolean isDropDownVisible() {
		s = new Select(yoe);
		s.selectByValue("1");
		String selectedValue = s.getFirstSelectedOption().getDomAttribute("value");
		return "1".equals(selectedValue);
	}

	public boolean isUserImageVisible() {
		return img.isDisplayed();
	}
}
