package com.simplilearn.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UserProfileUploadTest {

	final String siteURL = "file:///C:/Users/HOME/Desktop/Siimplilearn/phase5-autoIT-selenium-test-03-11-2021/static/upload-profile.html";
	final String driverPath = "driver/chromedriver.exe";
	WebDriver driver;
	
	@BeforeEach
	void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(siteURL);
	}

	@AfterEach
	void closeBrowser() {
//		driver.close();
	}
	

	@Test
	@DisplayName("Test :: User Profile Upload Test")
	void testUserProfileUPload() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("admin123");
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("profile")).sendKeys("Solution Architect");
		driver.findElement(By.id("address")).sendKeys("XYZ Complex, ABC Apartment");
		
		WebElement fileInput = driver.findElement(By.id("file-upload"));
		fileInput.sendKeys("E:\\response.png");
		
		driver.findElement(By.id("submit")).submit();
		Thread.sleep(3000);
	}

}
