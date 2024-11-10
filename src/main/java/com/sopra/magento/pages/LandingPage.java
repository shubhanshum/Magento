package com.sopra.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	@FindBy(linkText = "Create an Account")
	WebElement createAccountLink;
	
	@FindBy(linkText = "Sign In")
	WebElement signInLink;
	
	@FindBy(xpath="//span[text()='New Luma Yoga Collection']")
	WebElement yogaText;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister() {
		createAccountLink.click();
	}
	
	public void clickSignIn() {
		signInLink.click();
	}
	
	public boolean verifySignInLinkDisplayed() {
		return signInLink.isDisplayed();
	}
	
	public String getYogaCollectionText() {
		return yogaText.getText().toString();
	}
}
