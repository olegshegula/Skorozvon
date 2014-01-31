package com.skorozvon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Page {
	
	public LoginPage(WebDriver driver) {
		super(driver);		
	}

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement submit;
	

	public LoginPage enterEmail(String email_) {
		email.sendKeys(email_);
		return this;
	}

	public LoginPage enterPassword(String password_) {
		password.sendKeys(password_);
		return this;
	}

	public AccountPage clickLogin() {
		submit.click();
		return PageFactory.initElements(driver, AccountPage.class);
	}

	
}
