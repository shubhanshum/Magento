package com.sopra.magento.tests;

import java.util.Base64;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sopra.magento.pages.LandingPage;
import com.sopra.magento.pages.MyAccountPage;
import com.sopra.magento.pages.SignInPage;
import com.sopra.magento.utilities.Utility;

public class SignInTest extends RunnerTest{

	LandingPage landingPage;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	
	@Test
	public void signintest() {
		landingPage=new LandingPage(getDriver());
		signInPage=new SignInPage(getDriver());
		myAccountPage=new MyAccountPage(getDriver());
		landingPage.clickSignIn();
		System.out.println("I clicked");
		signInPage.login(Utility.getPropFileData("Email"), Utility.getPropFileData("Pwd"));
		Assert.assertTrue(myAccountPage.verifyMyAccountTextDisplayed());
		
	}
}
