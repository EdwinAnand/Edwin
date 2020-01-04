package com.automationPracticeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AutomationPractice.BasePage1;
import com.AutomationPractice.DetailObjectsAP;

public class DetailTestAP {
	DetailObjectsAP dlap;
	BasePage1 bpap;
	
	public DetailTestAP() {
		dlap = new DetailObjectsAP();
		bpap = new BasePage1();			
	}
	
	@Test
	public void verifytwtshare() {
		dlap.dress().click();
		dlap.prdctsel().click();
		Assert.assertTrue(bpap.elementFound(dlap.twitter()), "Twittwer button failed");
		Assert.assertTrue(dlap.elementFound(dlap.sharebtn()), "Share button failed");
		String val= new String(dlap.description().getText());
		System.out.println(val);
		Assert.assertTrue(val.contains("100"), "Description Failed");
			
	}
	
	

}
