package com.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailObjectsAP extends BasePage1{
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	@FindBy(xpath="//div[@class='right-block']//h5//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product']")
	private WebElement prdctsel;
	@FindBy(xpath="//*[@class='btn btn-default btn-twitter']")
	private WebElement twitter;
	@FindBy(id="send_friend_button")
	private WebElement sharebtn;
	@FindBy(xpath="//div[@itemprop='description']//p")
	private WebElement description;
	
	public DetailObjectsAP() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement dress(){
		return dress;
	}
	public WebElement prdctsel(){
		return prdctsel;
	}
	public WebElement twitter() {
		return twitter;
	}
	public WebElement sharebtn() {
		return sharebtn;
	}
	public WebElement description() {
		return description;
	}
	

}
