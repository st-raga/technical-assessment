package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test3 extends TestBase {

	@Test
	public void testDropDownButtonDefaultOption() {
		String expectedSelectedOption = "Option 1";
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption, "The default value is not right");
	}

	@Test
	public void testDropDownChangeSelectedOption() {
		String newOption = "Option 3";
		String expectedSelectedOption = newOption;
		mainPage.selectOption(newOption);
		String actualSelectedOption = mainPage.getDropDownButtonText();
		Assert.assertEquals(actualSelectedOption, expectedSelectedOption, "After a different option is clicked, the value is not right");
	}
	
}
