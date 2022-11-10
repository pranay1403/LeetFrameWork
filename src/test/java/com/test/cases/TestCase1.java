package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.classes.HomePage;
import com.pages.classes.LoginPage;

public class TestCase1 extends BaseClass {

	@Test
	public void LoginFuctionality() {
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityofsigninbtn());
		hp.clickonSigninbtn();
		LoginPage lp = new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfusername());
		Assert.assertTrue(lp.visiabilityOfpassword());
		lp.enterCridentials();
		Assert.assertTrue(lp.visiabilityOfsignbtn());
		lp.clickonSigninbtn();

	}

}
