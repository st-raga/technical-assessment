package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test5 extends TestBase {

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
