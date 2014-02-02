/**
 * 
 */
package com.skorozvon.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.skorozvon.core.SelTestCase;
import com.skorozvon.data.RegistrationData;
import com.skorozvon.pages.LoginPage;


/**
 * @author Oleg
 *
 */

//@Listeners(com.skorozvon.listener.Screenshot.class)
public class SkorozvonTests extends SelTestCase {
	
	
	public void test()  {

		
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage loginPage = new LoginPage(driver);		
		loginPage.enterEmail("stqa.gm@gmail.com");
		loginPage.enterPassword("162534");
		loginPage.clickLogin();
		
		
	

	}

	
	@Test(dataProvider = "registrationCSVData", dataProviderClass = RegistrationData.class)
	public void testCreateContact(RegistrationData registrationData)  {

		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
				
		loginPage.enterEmail("stqa.gm@gmail.com");
		loginPage.enterPassword("162534");
		loginPage.clickLogin();
		
		
	//	Assert.assertTrue(mainPage.isLoginButtonExits());

	}

}
