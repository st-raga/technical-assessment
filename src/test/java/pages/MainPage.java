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
	public boolean isEmailInputPresent() {
		return test1_emailInput.isDisplayed();
	}

	public boolean isPasswordInputPresent() {
		return test1_passwordInput.isDisplayed();
	}

	public boolean isSignInButtonPresent() {
		return test1_signInButton.isDisplayed();
	}

	public void setEmailInputValue(String email) {
		test1_emailInput.sendKeys(email);
	}

	public String getEmailInputValue() {
		return test1_emailInput.getAttribute("value");
	}

	public void setPasswordInputValue(String password) {
		test1_passwordInput.sendKeys(password);
	}

	public String getPasswordInputValue() {
		return test1_passwordInput.getAttribute("value");
	}

	public void signInButtonClick() {
		test1_signInButton.click();
	}

	// Test2 - Methods
	public int getListItemsSize() {
		int numOfListItems = test2_listItems.size();
		return numOfListItems;
	}

	public String getListItemTextByIndex(int index) {
		WebElement listItem = test2_listItems.get(index);
		return listItem.getText().substring(0, listItem.getText().lastIndexOf(" "));
	}

	public String getListItemBadgeValue(int index) {
		WebElement listItem = test2_listGroup.findElements(By.cssSelector("li.list-group-item")).get(index);
		return listItem.findElement(By.className("badge")).getText().trim();
	}

	// Test3 - Methods
	public String getDropDownButtonText() {
		return test3_dropDownButton.getText();
	}

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
	public boolean isButtonEnable(int index) {
		return test4_buttons.get(index).isEnabled();
	}

	// Test5 - Methods
	public void waitForButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(test5_button));
	}

	public void clickRandomButton() {
		test5_button.click();
	}

	public boolean isTest5AlertMessageDisplayed() {
		return test5_alertMessage.isDisplayed();
	}

	public String getTest5AlertMessage() {
		return test5_alertMessage.getText();
	}

	public Boolean isTest5ButtonEnable() {
		return test5_button.isEnabled();
	}

	// Test6 - Locators
	public String getCellValue(int row, int col) {
		WebElement cell = test6_table.findElement(By.xpath("//tbody/tr[" + (row + 1) + "]/td[" + (col + 1) + "]"));
		return cell.getText();
	}
}
