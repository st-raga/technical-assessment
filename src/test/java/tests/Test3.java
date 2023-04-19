package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test3 extends TestBase {

	@Test
	public void testDropDownButtonDefaultOption() {
		String expectedSelectedOption = "Option 1";
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption);
	}

	@Test
	public void testDropDownChangeSelectedOption() {
		String newOption = "Option 3";
		String expectedSelectedOption = "Option 3";
		mainPage.selectOption(newOption);
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption);
	}
	
}
