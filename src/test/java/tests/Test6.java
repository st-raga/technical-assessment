package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test6 extends TestBase {

	/**
	 * Test 6 Navigate to the home page Write a method that allows you to find the
	 * value of any cell on the grid Use the method to find the value of the cell at
	 * coordinates 2, 2 (staring at 0 in the top left corner) Assert that the value
	 * of the cell is "Ventosanzap"
	 */

	/**
	 * Validates that in the cell(2,2) the text is "Ventosanzap"
	 */
	@Test
	public void testTableCellValue() {
		String expectedCellValue = "Ventosanzap";
		String actualCellValue = mainPage.getCellValue(2, 2);
		Assert.assertEquals(actualCellValue, expectedCellValue, "Value in cell is not right");
	}

}
