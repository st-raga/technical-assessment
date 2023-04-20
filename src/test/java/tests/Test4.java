package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test4 extends TestBase {

	/**
	 * Test 4 Navigate to the home page In the test 4 div, assert that the first
	 * button is enabled and that the second button is disabled
	 */

	/**
	 * Validates that first button is enabled.
	 */
	@Test
	public void testFirstButtonIsEnable() {
		Assert.assertTrue(mainPage.isButtonEnable(0), "First Button is not enable");
	}

	/**
	 * Validates that the second button is disabled.
	 */
	@Test
	public void testSecondButtonIsDisable() {
		Assert.assertFalse(mainPage.isButtonEnable(1), "Second Button is not disable");
	}

}
