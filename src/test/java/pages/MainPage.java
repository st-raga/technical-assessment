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

    // WebElements and Methods to access elements on the page
    
    //Test1
    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;
        
    @FindBy(xpath = "//div[@id=\"test-1-div\"]/form/button")
    private WebElement signInButton;
        
    public boolean isEmailInputPresent() {
        return emailInput.isDisplayed();
    }
    
    public boolean isPasswordInputPresent() {
        return passwordInput.isDisplayed();
    }
    
    public boolean isSignInButtonPresent() {
        return signInButton.isDisplayed();
    }
    
    public void setEmailInputValue(String email) {
    	emailInput.sendKeys(email); 
    }
    
    public String getEmailInputValue() {
        return emailInput.getAttribute("value");
    }
    
    public void setPasswordInputValue(String password) {
    	passwordInput.sendKeys(password); 
    }
    
    public String getPasswordInputValue() {
        return passwordInput.getAttribute("value");
    }
    
    public void signInButtonClick() {
    	signInButton.click();
    }
    
    //Test2
    
    @FindBy(css = "#test-2-div ul.list-group")
    private WebElement listGroup;
    
    @FindBy(css = "#test-2-div ul.list-group li.list-group-item")
    private List<WebElement> listItems;
    
	public int getListItemsSize() {
    	int numOfListItems = listItems.size();
    	return numOfListItems;
	}
	
	public String getListItemTextByIndex(int index) {
        WebElement listItem = listItems.get(index);
        return listItem.getText().substring(0, listItem.getText().lastIndexOf(" "));
	}
	
    public String getListItemBadgeValue(int index) {
        WebElement listItem = listGroup.findElements(By.cssSelector("li.list-group-item")).get(index);
        return listItem.findElement(By.className("badge")).getText().trim();
    }
    
    // Test3
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropDownButton;
    
    public String getDropDownButtonText() {
    	return dropDownButton.getText();
    }
    
    public void selectOption(String optionText) {
    	dropDownButton.click();
    	List<WebElement> dropDownOptions = dropDownButton.findElements(By.xpath("//*[@id=\"test-3-div\"]/div/div/a"));
    	for (WebElement dropdownOption : dropDownOptions) {
            if (dropdownOption.getText().equals(optionText)) {
                dropdownOption.click();
                return;
            }
        }
    }
    
    // Test 4
    @FindBy(xpath = "//div[@id='test-4-div']/button")
    private List<WebElement> div4Buttons;
    
    public boolean isButtonEnable(int index) {
    	return div4Buttons.get(index).isEnabled();
    }
    
    // Test 5
    @FindBy(id = "test5-button")
    private WebElement test5Button;
    
    @FindBy(id = "test5-alert")
    private WebElement test5AlertMessage;
    
    public void waitForButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(test5Button));
    }
    
    public void clickRandomButton() {
        test5Button.click();
    }
    
    public boolean isTest5AlertMessageDisplayed() {
    	return test5AlertMessage.isDisplayed();
    }
    
    public String getTest5AlertMessage() {
    	return test5AlertMessage.getText();
    }
    
    public Boolean isTest5ButtonEnable() {
    	return test5Button.isEnabled();
    }
    
    // Test 6
    @FindBy(xpath = "//table[@class='table table-bordered table-dark']")
    private WebElement table;
    
    public String getCellValue(int row, int col) {
        WebElement cell = table.findElement(By.xpath("//tbody/tr[" + (row + 1) + "]/td[" + (col + 1) + "]"));
        return cell.getText();
    }
    

}
