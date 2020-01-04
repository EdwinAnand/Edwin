package com.automationPracticeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AutomationPractice.BasePage1;
import com.AutomationPractice.DresspageObjectsAP;

public class DresspageTestAP extends BasePage1{
	DresspageObjectsAP dpap;
	BasePage1 bpap;

	public DresspageTestAP() {
		dpap = new DresspageObjectsAP();
		bpap = new BasePage1();
	}
	
	@Test
	public void verifyLMS() {
		dpap.dress().click();
		Assert.assertTrue(bpap.elementFound(dpap.smallcb()), "Small size is not displayed");
		Assert.assertTrue(bpap.elementFound(dpap.mediumcb()),"Medium size is not displayed");
		Assert.assertTrue(bpap.elementFound(dpap.largecb()), "Large size is not displayed");
	}
	@Test
	public void verifycart() {
		dpap.dress().click();
		dpap.prdctsel().click();
		dpap.addtocart().click();
		dpap.prcdtochout().click();
		Assert.assertTrue(dpap.getTxtAttribute(dpap.qtybox()).contains("1"));
	}
	@Test
	public void verifyimgsize() {
		dpap.dress().click();
		String s=dpap.getcount().getText();
		int b=dpap.img().size();
		String coun=Integer.toString(b);
		System.out.println("The count is " +coun+" | "+s);
		Assert.assertTrue(s.contains(coun),"Count dresses failed");
	}




}
