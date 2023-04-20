package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test3 extends TestBase {

	/**
	 * Test 3 Navigate to the home page In the test 3 div, assert that "Option 1" is
	 * the default selected value Select "Option 3" from the select list
	 */

	/**
	 * Validates that the default value is "Option 1".
	 */
	@Test
	public void testDropDownButtonDefaultOption() {
		String expectedSelectedOption = "Option 1";
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption, "The default value is not right");
	}

	/**
	 * Selects a different option and validates that this option is selected. In
	 * this case "Option 3".
	 */
	@Test
	public void testDropDownChangeSelectedOption() {
		String newOption = "Option 3";
		String expectedSelectedOption = newOption;
		mainPage.selectOption(newOption);
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption,
				"After a different option is clicked, the value is not right");
	}

}
