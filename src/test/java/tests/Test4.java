package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test4 extends TestBase{

	@Test
	public void checkButtonsState() {
		Assert.assertTrue(mainPage.isButtonEnable(0), "First Button is not enable");
		Assert.assertFalse(mainPage.isButtonEnable(1), "Second Button is not disable");
	}
	
}
