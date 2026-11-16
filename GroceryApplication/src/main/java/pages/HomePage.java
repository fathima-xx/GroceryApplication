package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")WebElement deliveryBoyInfo;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement moreInfo;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")WebElement adminUserText;
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement adminButton;
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]")WebElement categoryinfo;
	public ManageDeliveryBoyPage boyInfo()
	{
		deliveryBoyInfo.click();
		return new ManageDeliveryBoyPage(driver);
	}
	public LoginPage clickLogout()
	{
		logout.click();
		return new LoginPage(driver);
	}
	public AdminUsersPage Info()
	{
		moreInfo.click();
		return new AdminUsersPage(driver);
	}
	public String adminUserTextDisplay()
	{
		return adminUserText.getText();
	}
	public AddCategoryPage catinfo()
	{
		categoryinfo.click();
		return new AddCategoryPage(driver);
	}
	public HomePage adminButton()
	{
		adminButton.click();
		return this;
	}
}

/*
 * create webelement for more info and a method to click more info*/
	



