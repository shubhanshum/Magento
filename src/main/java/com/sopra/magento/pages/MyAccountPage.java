package com.sopra.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

WebDriver driver;
	
	@FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
	WebElement myAcoountText;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyMyAccountTextDisplayed() {
		return myAcoountText.isDisplayed();
	}
}
