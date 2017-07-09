package com.selenium.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TrackoMain {
	WebDriver driver;

	String yourname = "Priyanka";
	String youremail= "abc@abc.com";
	String mobile="9876543210";
	String otp= "123456";
	@Test
	public void f() {
		
	}
		
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "Resourses/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://dev.tracko.co.in/");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		

			

		}
	}
	
