package com.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObjectsAP extends BasePage1{
	
	@FindBy(xpath="//li//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")

	private WebElement dress3232;

	private WebElement dress1212;

	
//	@FindBy(xpath="(//li[@class]//a[@title='Dresses']")
//	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
//	@FindBy(xpath="(//li[@class]//a[@title='T-shirts']")
//	private WebElement tshirt;
	
	@FindBy(id="newsletter-input")
	private WebElement newsltr;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement newsbtn;
	
	@FindBy(xpath ="//*[@class='alert alert-success']")
	private WebElement alertMsg;
	
	public HomepageObjectsAP() {
		PageFactory.initElements(driver, this);
	}
	public void setemail(String email) {
		setText(newsltr,email);
	}
	public WebElement getwomen(){
		return Women;
	}
	public WebElement getdress(){
		return dress1212;
	}
	public WebElement gettshirt(){
		return tshirt;
	}
	public WebElement getnewsletter(){
		return newsltr;
	}
	public WebElement getnewsbtn() {
		return newsbtn;
	}
	
	public WebElement getsubscribemsg() {
		return alertMsg;
	}
}
