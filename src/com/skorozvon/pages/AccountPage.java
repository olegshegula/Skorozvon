/**
 * 
 */
package com.skorozvon.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author shcegula-os
 *
 */
public class AccountPage  {

	private WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='�������']")
	private WebElement leads;

	/* (non-Javadoc)
	 * @see com.skorozvon.pages.Page#open()
	 */
	
	public boolean isPageOpened() {
		return leads.isDisplayed();
	}
	
	public LeadsPage clickMenuLeads(){
		leads.click();	
		return PageFactory.initElements(driver, LeadsPage.class);
	}

}
