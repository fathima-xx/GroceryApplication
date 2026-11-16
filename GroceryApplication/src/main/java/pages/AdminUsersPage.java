package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	PageUtility pu = new PageUtility();
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//input[@id='username']")WebElement usernameText;
	@FindBy(xpath="//input[@id='password']")WebElement passwordText;
	@FindBy(xpath="//select[@id='user_type']")WebElement select;
	@FindBy(xpath="//button[@name='Create']")WebElement saveButton;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")WebElement alert;
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-primary']")WebElement searchClick;
	@FindBy(xpath="//input[@name='un']")WebElement user;
	@FindBy(xpath="//select[@name='ut']")WebElement selectUser;
	@FindBy(xpath="//button[@name='Search']")WebElement searchRed;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")WebElement Msg;	
	
	public AdminUsersPage newButton()
	{
		newButton.click();
		return this;
	}
	public AdminUsersPage enterUsername(String usernamevalue1)
	{
		usernameText.sendKeys(usernamevalue1);
		return this;
	}
	public AdminUsersPage enterPasswordname(String passwordvalue1)
	{
		passwordText.sendKeys(passwordvalue1);
		return this;
	}
	public AdminUsersPage select()
	{
		pu.selectDropdownWithVisibleText(select, "Admin");
		return this;
		 
	}
	public AdminUsersPage clickSave()
	{
		saveButton.click();
		return this;
	}
	public boolean alertDisplay()
	{
		return alert.isDisplayed();
	}
	public AdminUsersPage search()
	{
		searchClick.click();
		return this;
	}
	public AdminUsersPage username(String usernamevalue2)
	{
		user.sendKeys(usernamevalue2);
		return this;
	}
	public AdminUsersPage selectClick()
	{
		pu.selectDropdownWithVisibleText(selectUser, "Admin");
		return this;
		 
	}
	public AdminUsersPage searchUser() 
	{
		searchRed.click();
		return this;
	}
	public boolean alertMsg() 
	{
		return Msg.isDisplayed();
	}
}

/*creat webelement for new,username,passworrd,usertype,save
 * excel sheet: adminuser*/
 