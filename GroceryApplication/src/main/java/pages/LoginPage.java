package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	WaitUtility wu = new WaitUtility();
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement username;
	@FindBy(xpath="//input[@type='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement login ;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement DashBoard;
	@FindBy(xpath="//b[text()='7rmart supermarket']")WebElement loginpageText;
	public LoginPage enterUsernameOnUsernameFeild(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
		return this;
	}
	public LoginPage enterPasswordOnPasswordFeild(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
	public HomePage clickLoginbutton()
	{
		wu.waitUntilElementToBeClickable(driver, login);
		login.click();
		return new HomePage(driver);
	}
	public boolean verifyWhetherdashBoardIsDisplayed() 
	{
		return DashBoard.isDisplayed();
	}
	public String verifyLoginTextIsDisplayed()
	{
		return loginpageText.getText();
	}
}



