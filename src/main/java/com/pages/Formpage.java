package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
	WebDriver driver;
	WebDriverWait wait;
	public FormPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//select[@id='experience']")
	WebElement yoe;
	
	@FindBy(xpath="//input[@id='skills']")
	WebElement skills;
	
	@FindBy(xpath="//input[@id='websites']")
	WebElement websites;
	
	@FindBy(xpath="//input[@id='apps']")
	WebElement apps;
	
	@FindBy(xpath="//button[@id='measureBtn']")
	WebElement submit;
	
	@FindBy(xpath="//div[@id='result']")
	WebElement result;
	
	@FindBy(xpath="//div[@id='result']/h2")
	WebElement resultName;
	
}
