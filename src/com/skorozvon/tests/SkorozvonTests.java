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
import com.skorozvon.pages.Page;


/**
 * @author Oleg
 *
 */
@Listeners(com.skorozvon.listener.Screenshot.class)
public class SkorozvonTests extends SelTestCase {
	
	@Test(dataProvider = "registrationCSVData", dataProviderClass = RegistrationData.class)
	public void testCreateContact(RegistrationData registrationData) throws Throwable {

		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
				
		loginPage.enterEmail("stqa.gm@gmail.com");
		loginPage.enterPassword("162534");
		loginPage.clickLogin();
		
		
	//	Assert.assertTrue(mainPage.isLoginButtonExits());

	}

}
