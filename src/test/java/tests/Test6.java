package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test6 extends TestBase {

	@Test
	public void testTableCellValue() {
		String expectedCellValue = "Ventosanzap";
		String actualCellValue = mainPage.getCellValue(2, 2);
		Assert.assertEquals(actualCellValue, expectedCellValue);
	}
	
}
