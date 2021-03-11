package com.simplilearn.webapp.test.githubprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUserToGithub {

	public static void userLogin() {
		
		WebDriver driver = RunTimeDriver.getDriver();
		final String siteURL = "https://github.com/login";
			
		driver.get(siteURL);
		
		driver.findElement(By.id("login_field")).sendKeys(LoginCredentials.username);
		driver.findElement(By.id("password")).sendKeys(LoginCredentials.password);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).submit();
		
	}
}
