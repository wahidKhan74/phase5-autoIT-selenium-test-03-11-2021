package com.simplilearn.webapp.test.githubprofile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadGithubUserProfileTest {
	
	String siteURL = "https://github.com/settings/profile";
	
	@BeforeEach
	void setUp() {
		InitializeDriver.init();
	}

	@AfterEach
	void closeBrowser() {
//		InitializeDriver.destroy();
	}
	@Test
	public void testForGithubUserProfileUpload() throws InterruptedException, IOException {
		WebDriver driver = RunTimeDriver.getDriver();
		
		LoginUserToGithub.userLogin();
		Thread.sleep(2000);
		
		driver.get(siteURL);
		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		driver.findElement(
				By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIT\\upload-new-profile.exe");
		
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
	}
}
