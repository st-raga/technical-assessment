package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test1 extends TestBase {

	/**
	 * Test 1 Navigate to the home page Assert that both the email address and
	 * password inputs are present as well as the login button Enter in an email
	 * address and password combination into the respective fields
	 */

	/**
	 * Validates if all three elements are present.
	 */
	@Test
	public void testLoginElementsExist() {
		Assert.assertTrue(mainPage.isEmailInputPresent(), "Email input is not present");
		Assert.assertTrue(mainPage.isPasswordInputPresent(), "Password input is not present");
		Assert.assertTrue(mainPage.isSignInButtonPresent(), "SignIn button is not present");
	}

	/**
	 * Validates if the texts entered in both inputs are as expected.
	 */
	@Test
	public void testLoginElementsInput() {
		String myEmail = "email@gmail.com";
		String myPassword = "password123";

		mainPage.setEmailInputValue(myEmail);
		Assert.assertEquals(mainPage.getEmailInputValue(), myEmail,
				"Text in input email does not match with the one entered");

		mainPage.setPasswordInputValue(myPassword);
		Assert.assertEquals(mainPage.getPasswordInputValue(), myPassword,
				"Text in input password does not match with the one entered");
	}

	/**
	 * Validates the input status after submit. In this case, the input elements are
	 * left empty.
	 */
	@Test
	public void testSampleLogin() {
		String myEmail = "email@gmail.com";
		String myPassword = "password123";

		mainPage.setEmailInputValue(myEmail);
		mainPage.setPasswordInputValue(myPassword);
		mainPage.signInButtonClick();

		Assert.assertEquals(mainPage.getEmailInputValue(), "", "Input email should be empty");
		Assert.assertEquals(mainPage.getPasswordInputValue(), "", "Input password should be empty");
	}

}
