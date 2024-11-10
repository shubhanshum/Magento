package com.sopra.magento.tests;

import org.testng.annotations.Test;

import com.sopra.magento.pages.LandingPage;
import com.sopra.magento.pages.RegisterPage;
import com.sopra.magento.utilities.Utility;

public class RegistrationTest extends RunnerTest{

	LandingPage landingpage;
	RegisterPage registerPage;
	
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void registrationTest() {
		landingpage =new LandingPage(getDriver());
		registerPage=new RegisterPage(getDriver());
		landingpage.clickOnRegister();
		registerPage.registerUser(Utility.getPropFileData("FirstName"), Utility.getPropFileData("LastName"), Utility.getPropFileData("Email"), Utility.getPropFileData("Pwd"), Utility.getPropFileData("ConPwd"));
		
	}
}
