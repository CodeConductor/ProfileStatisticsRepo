package com.baseTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	protected Alert alert;
	@BeforeMethod
	public void initialize(){
		driver = new ChromeDriver();
		driver.get("https://kashishbarnwal2611.github.io/PentagonProfileStats/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@AfterMethod
	public void exit() {
		driver.quit();
	}
}
