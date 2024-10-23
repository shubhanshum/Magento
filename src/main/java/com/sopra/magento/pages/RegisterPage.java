package com.sopra.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

WebDriver driver;
	
	@FindBy(id = "firstname")
	WebElement firstNameTxtField;
	
	@FindBy(id = "lastname")
	WebElement lastNameTxtField;
	
	@FindBy(id = "email_address")
	WebElement emailTxtField;

	@FindBy(id = "password")
	WebElement passwordTxtField;
	
	@FindBy(id = "password-confirmation")
	WebElement cnfPasswordTxtField;
	
	@FindBy(xpath = "//button[@title='Create an Account']")
	WebElement createAccBtn;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registerUser(String firstName, String lastName, String email, String pwd, String cnfPwd) {
		firstNameTxtField.sendKeys(firstName);
		lastNameTxtField.sendKeys(lastName);
		emailTxtField.sendKeys(email);
		passwordTxtField.sendKeys(pwd);
		cnfPasswordTxtField.sendKeys(cnfPwd);
		createAccBtn.click();
	}
}
