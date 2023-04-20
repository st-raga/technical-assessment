package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage {

	private WebDriver driver;

	// Constructor
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Test1 - Locators
	@FindBy(id = "inputEmail")
	private WebElement test1_emailInput;

	@FindBy(id = "inputPassword")
	private WebElement test1_passwordInput;

	@FindBy(xpath = "//div[@id=\"test-1-div\"]/form/button")
	private WebElement test1_signInButton;

	// Test2 - Locators
	@FindBy(css = "#test-2-div ul.list-group")
	private WebElement test2_listGroup;

	@FindBy(css = "#test-2-div ul.list-group li.list-group-item")
	private List<WebElement> test2_listItems;

	// Test3 - Locators
	@FindBy(id = "dropdownMenuButton")
	private WebElement test3_dropDownButton;

	// Test4 - Locators
	@FindBy(xpath = "//div[@id='test-4-div']/button")
	private List<WebElement> test4_buttons;

	// Test5 - Locators
	@FindBy(id = "test5-button")
	private WebElement test5_button;

	@FindBy(id = "test5-alert")
	private WebElement test5_alertMessage;

	// Test6 - Locators
	@FindBy(xpath = "//table[@class='table table-bordered table-dark']")
	private WebElement test6_table;

	// Test1 - Methods

	/**
	 * Verifies if the test1_emailInput is displayed
	 * 
	 * @return true if it is or false if it is not
	 */
	public boolean isEmailInputPresent() {
		return test1_emailInput.isDisplayed();
	}

	/**
	 * Verifies if the test1_passwordInput is displayed
	 * 
	 * @return true if it is or false if it is not
	 */
	public boolean isPasswordInputPresent() {
		return test1_passwordInput.isDisplayed();
	}

	/**
	 * Verifies if the test1_signInButton is displayed
	 * 
	 * @return true if it is or false if it is not
	 */
	public boolean isSignInButtonPresent() {
		return test1_signInButton.isDisplayed();
	}

	/**
	 * Writes on the test1_emailInput
	 * 
	 * @param email receive the value of the email we want to enter
	 */
	public void setEmailInputValue(String email) {
		test1_emailInput.sendKeys(email);
	}

	/**
	 * Gets the attribute value of test1_emailInput
	 * 
	 * @return the actual value written on the input
	 */
	public String getEmailInputValue() {
		return test1_emailInput.getAttribute("value");
	}

	/**
	 * Writes on the test1_passwordInput
	 * 
	 * @param email receive the value of the email we want to enter
	 */
	public void setPasswordInputValue(String password) {
		test1_passwordInput.sendKeys(password);
	}

	/**
	 * Gets the attribute value of test1_passwordInput
	 * 
	 * @return the actual value written on the input
	 */
	public String getPasswordInputValue() {
		return test1_passwordInput.getAttribute("value");
	}

	public void signInButtonClick() {
		test1_signInButton.click();
	}

	// Test2 - Methods

	/**
	 * Get the size of the WebElement test2_listItems
	 * 
	 * @return the number of elements in test2_listItems
	 */
	public int getListItemsSize() {
		return test2_listItems.size();
	}

	/**
	 * Get the text of one of the test2_listItems indicated by the index
	 * 
	 * @param index receive the number of the element. Number should be between 0
	 *              and the size()-1
	 * @return the text of the div, not including the text on the span
	 */
	public String getListItemTextByIndex(int index) {
		WebElement listItem = test2_listItems.get(index);
		return listItem.getText().substring(0, listItem.getText().lastIndexOf(" "));
	}

	/**
	 * Get the text of one of the test2_listItems badge indicated by the index
	 * 
	 * @param index index receive the number of the element. Number should be
	 *              between 0 and the size()-1
	 * @return the text of the span corresponding to the badge
	 */
	public String getListItemBadgeValue(int index) {
		WebElement listItem = test2_listGroup.findElements(By.cssSelector("li.list-group-item")).get(index);
		return listItem.findElement(By.className("badge")).getText();
	}

	// Test3 - Methods

	/**
	 * Get the text of test3_dropDownButton
	 * 
	 * @return the text of test3_dropDownButton
	 */
	public String getDropDownButtonText() {
		return test3_dropDownButton.getText();
	}

	/**
	 * Clicks on the button test3_dropDownButton to show options, gets the available
	 * options, and if one the options match with the received param clicks on it
	 * 
	 * @param optionText the option we want to select
	 */
	public void selectOption(String optionText) {
		test3_dropDownButton.click();
		List<WebElement> test3_dropDownOptions = test3_dropDownButton
				.findElements(By.xpath("//a[@class=\"dropdown-item\"]"));
		for (WebElement dropdownOption : test3_dropDownOptions) {
			if (dropdownOption.getText().equals(optionText)) {
				dropdownOption.click();
				return;
			}
		}
	}

	// Test4 - Methods

	/**
	 * Verifies if one of the buttons in test4_buttons is enabled
	 * 
	 * @param index receive the index of the button we want to check (Between 0 and
	 *              1 in this case)
	 * @return true is the button indicated is enabled or false if not
	 */
	public boolean isButtonEnable(int index) {
		return test4_buttons.get(index).isEnabled();
	}

	// Test5 - Methods

	/**
	 * Waits until test5_button is visible. The time was set to 15 seconds,
	 * according to the html code it could be a random value between 1 and 10
	 * seconds.
	 */
	public void waitForButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(test5_button));
	}

	/**
	 * Clicks on test5_button
	 */
	public void clickRandomButton() {
		test5_button.click();
	}

	/**
	 * Verifies if the alert test5_alertMessage is displayed
	 * 
	 * @return true if it is or false if not
	 */
	public boolean isTest5AlertMessageDisplayed() {
		return test5_alertMessage.isDisplayed();
	}

	/**
	 * Gets the text of test5_alertMessage
	 * 
	 * @return text of alert test5_alertMessage
	 */
	public String getTest5AlertMessage() {
		return test5_alertMessage.getText();
	}

	/**
	 * Verifies if test5_button is enabled
	 * 
	 * @return true if it is or false if not
	 */
	public Boolean isTest5ButtonEnable() {
		return test5_button.isEnabled();
	}

	// Test6 - Methods
	/**
	 * Finds the content of one of the cells in table test6_table
	 * 
	 * @param row index of the row (starting in 0)
	 * @param col index of the column (starting in 0)
	 * @return the text on the cell indicated by (row, col)
	 */
	public String getCellValue(int row, int col) {
		WebElement cell = test6_table.findElement(By.xpath("//tbody/tr[" + (row + 1) + "]/td[" + (col + 1) + "]"));
		return cell.getText();
	}
}
