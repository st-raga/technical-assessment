package base;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


import pages.MainPage;

public class TestBase {

	private WebDriver driver;
	protected MainPage mainPage;
	
	// HTML File path
	URL resourceUrl = getClass().getClassLoader().getResource("QE-index.html");
	String filePath = resourceUrl.getPath();
		
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		
		// Navigate to Main Page before each Test
		driver.get("file://" + filePath);
		
		// Initialize mainPage instance using PageFactory
		mainPage = PageFactory.initElements(driver, MainPage.class);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}
