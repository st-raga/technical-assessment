package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test1 extends TestBase{

	@Test
	public void testLoginElementsExist() {
		Assert.assertTrue(mainPage.isEmailInputPresent(), "Email input is not present");
		Assert.assertTrue(mainPage.isPasswordInputPresent(), "Password input is not present");
		Assert.assertTrue(mainPage.isSignInButtonPresent(), "SignIn button is not present");
	}

	@Test
	public void testLoginElementsInput() {
		String myEmail = "email@gmail.com";
		String myPassword = "password123";
		
		mainPage.setEmailInputValue(myEmail);
		Assert.assertEquals(mainPage.getEmailInputValue(), myEmail);
		
		mainPage.setPasswordInputValue(myPassword);
		Assert.assertEquals(mainPage.getPasswordInputValue(), myPassword);
	}

	@Test
	public void testSampleLogin() {
		String myEmail = "email@gmail.com";
		String myPassword = "password123";
		
		mainPage.setEmailInputValue(myEmail);
		mainPage.setPasswordInputValue(myPassword);
		mainPage.signInButtonClick();
		
		Assert.assertEquals(mainPage.getEmailInputValue(), "");
	}
	
}
