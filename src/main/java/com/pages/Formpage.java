package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Formpage {
	WebDriver driver;
	public Formpage(WebDriver driver) {
		this.driver = driver;
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
	
}
