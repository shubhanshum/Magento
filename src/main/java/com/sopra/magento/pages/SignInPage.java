package com.sopra.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement emailTxt;
	
	@FindBy(id = "pass")
	WebElement pwdTxt;
	
	@FindBy(id = "send2")
	WebElement signInBtn;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String pwd) {
		emailTxt.sendKeys(email);
		pwdTxt.sendKeys(pwd);
		signInBtn.click();
	}
}
