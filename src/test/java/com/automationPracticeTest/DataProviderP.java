package com.automationPracticeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderP {
public WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@DataProvider(name = "verifylogin1")
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="admin";
		data[1][1]="admin23";
		
		data[2][0]="Admin";
		data[2][1]="admin23";
		
		
		return data;
		
	}
	@Test(dataProvider="verifylogin1")
	public void verifyLogin(String UserName,String PassWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
		driver.findElement(By.id("btnLogin")).click();
	}
	

}
