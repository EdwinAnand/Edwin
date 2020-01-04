package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingP {
public WebDriver driver;
	
	@BeforeMethod
	public void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

	@Test
	@Parameters({"UserName","PassWord"})
	public void verifyLogin(String UserName,String PassWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
		driver.findElement(By.id("btnLogin")).click();
		
	}




}
