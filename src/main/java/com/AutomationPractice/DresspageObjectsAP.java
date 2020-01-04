package com.AutomationPractice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class DresspageObjectsAP extends BasePage1{
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement smallcb;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement mediumcb;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement largecb;
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement prdtno;
	@FindBy(xpath="//div[@class='right-block']//h5//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product']")
	private WebElement prdctsel;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement addtocart;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order'][@title='Proceed to checkout']")
	private WebElement prcdtochout;
	@FindBy(xpath="//input[@class='cart_quantity_input form-control grey']")
	private WebElement qtybox;
	@FindBy(xpath="//a[@class='product_img_link']")
	private List<WebElement> img;
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement count;
	
	
	public DresspageObjectsAP() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement dress(){
		return dress;
	}
	public WebElement smallcb(){
		return smallcb;
	}
	public WebElement mediumcb(){
		return mediumcb;
	}
	public WebElement largecb(){
		return largecb;
	}
	public WebElement prdtno(){
		return prdtno;
	}
	public WebElement prdctsel(){
		return prdctsel;
	}
	public WebElement addtocart(){
		return addtocart;
	}
	public WebElement prcdtochout(){
		return prcdtochout;
	}
	public WebElement qtybox() {
		return qtybox;
	}
	public List<WebElement> img() {
		return img;
	}
	public WebElement getcount() {
		return count;
	}


	

}
