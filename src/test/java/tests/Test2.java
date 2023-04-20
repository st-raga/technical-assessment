package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test2 extends TestBase {

	/**
	 * Test 2 Navigate to the home page In the test 2 div, assert that there are
	 * three values in the listgroup Assert that the second list item's value is set
	 * to "List Item 2" Assert that the second list item's badge value is 6
	 */

	/**
	 * Validates that there are three values in the listgroup.
	 */
	@Test
	public void testNumberOfItemsinListGroup() {
		int expectedItemsSize = 3;
		int actualItemsSize = mainPage.getListItemsSize();
		Assert.assertEquals(actualItemsSize, expectedItemsSize, "Number of items is ListGroup is not right");
	}

	/**
	 * Validates that the second list item's value is "List Item 2".
	 */
	@Test
	public void testSecondListItemText() {
		String expectedSecondItemText = "List Item 2";
		String actualSecondItemText = mainPage.getListItemTextByIndex(1);
		Assert.assertEquals(actualSecondItemText, expectedSecondItemText,
				"The text in the second list item value is not right");
	}

	/**
	 * Validates that the second list item's badge is 6.
	 */
	@Test
	public void testSecondListItemBadgeText() {
		String expectedSecondItemBadgeText = "6";
		String actualSecondItemBadgeText = mainPage.getListItemBadgeValue(1);
		Assert.assertEquals(actualSecondItemBadgeText, expectedSecondItemBadgeText,
				"The text in the second list item badge is not right");
	}

}
