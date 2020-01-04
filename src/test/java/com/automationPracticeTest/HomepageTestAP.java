package com.automationPracticeTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AutomationPractice.BasePage1;
import com.AutomationPractice.HomepageObjectsAP;

public class HomepageTestAP {
	HomepageObjectsAP hpap;
	BasePage1 bpap;
	int random = new Random().nextInt(500000);
	String email = "heyyyy"+ random+"@gmail.com";

	public HomepageTestAP() {
		hpap = new HomepageObjectsAP();
		bpap = new BasePage1();
	}
	
	@Test
	public void verifywomen(){
		Assert.assertTrue(bpap.elementFound(hpap.getwomen()), "Women not displayed" );
		hpap.getwomen().click();
		Assert.assertTrue(hpap.getTitlte().contains("Women"));
	}
	
	@Test
	public void verifydress() {
		Assert.assertTrue(bpap.elementFound(hpap.getdress()), "dress not displayed" );
		hpap.getdress().click();
		Assert.assertTrue(hpap.getTitlte().contains("Dresses"));
	}
	@Test
	public void veriftshirt() {
		Assert.assertTrue(bpap.elementFound(hpap.gettshirt()), "Tshirt not displayed" );
		hpap.gettshirt().click();
		Assert.assertTrue(hpap.getTitlte().contains("shirt"));
	}
	@Test
	public void verifynewsletter() {
		Assert.assertTrue(bpap.elementFound(hpap.getnewsletter()));
		bpap.isElementVisible(hpap.getnewsletter());
	    hpap.setemail(email);
	    hpap.getnewsbtn().click();
		String val=hpap.getsubscribemsg().getText();
		System.out.println("the subscription verification msg is : "+val);
		Assert.assertTrue(hpap.elementFound(hpap.getsubscribemsg()), "Subscribtion msg ot found");
	}

}
