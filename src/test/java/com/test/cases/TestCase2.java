package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.classes.HomePage;
import com.pages.classes.SignupPage;

@Listeners(com.baseclass.listener.class)
public class TestCase2 extends BaseClass{

	@Test(description = "Validate SignUp Functionality of leetcode")
	public void SignUp() {
		
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityofCreatenewAcc());
		hp.clickonCreateNewAccbtn();
		SignupPage sp=new SignupPage(driver);
		Assert.assertTrue(sp.visiabilityofUser());
		Assert.assertTrue(sp.visiabilityofPass());
		Assert.assertTrue(sp.visiabilityofEmail());
		Assert.assertTrue(sp.visiabilityofConfirmpass());
		Assert.assertTrue(sp.visiabilityofSignupbtn());
		sp.enterCridential();
		try {
			sp.clickonSignupbtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
