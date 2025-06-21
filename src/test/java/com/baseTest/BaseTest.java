package com.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;
	public BaseTest(){
		driver = new ChromeDriver();
	}
}
