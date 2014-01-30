/**
 * 
 */
package com.skorozvon.tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author Oleg
 *
 */
@Listeners(com.skorozvon.listener.Screenshot.class)
public class SkorozvonTests extends BaseTest {
	
	@Test(enabled = true, priority = 0)
	public void testCreateContact() throws Throwable {

		

	}

}
