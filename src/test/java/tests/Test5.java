package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test5 extends TestBase {

	/**
	 * Test 5 Navigate to the home page In the test 5 div, wait for a button to be
	 * displayed (note: the delay is random) and then click it Once you've clicked
	 * the button, assert that a success message is displayed Assert that the button
	 * is now disabled
	 */

	/**
	 * Waits for a button to appear and verifies that it is enabled, clicks on it
	 * and validates that the button is disabled and an alert message appears.
	 */
	@Test
	public void testWaitExpectedConditions() {
		String expectedAlertMessage = "You clicked a button!";
		mainPage.waitForButton();
		Assert.assertTrue(mainPage.isTest5ButtonEnable(), "Button 5 is not enable");
		mainPage.clickRandomButton();
		Assert.assertTrue(mainPage.isTest5AlertMessageDisplayed(), "Alert is not displayed");
		String actualAlertMessage = mainPage.getTest5AlertMessage();
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Message in alert is not right");
		Assert.assertFalse(mainPage.isTest5ButtonEnable(), "Button 5 is not disable");
	}

}
