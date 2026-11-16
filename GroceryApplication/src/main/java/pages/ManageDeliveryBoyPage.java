package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	public WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newDeliveryBoy;
	@FindBy(xpath="//input[@id='name']")WebElement Name;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//textarea[@id='address']")WebElement address;
	@FindBy(xpath="//input[@id='username']")WebElement userName;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement userAlert;
	

public ManageDeliveryBoyPage newBoy()
{
	newDeliveryBoy.click();
	return this;
}
public ManageDeliveryBoyPage name(String name)
{
	Name.sendKeys(name);
	return this;
}
public ManageDeliveryBoyPage emailid(String emailId)
{
	email.sendKeys(emailId);
	return this;
}
public ManageDeliveryBoyPage phone(String phoneNumber)
{
	phone.sendKeys(phoneNumber);
	return this;
}
public ManageDeliveryBoyPage address(String addressValue)
{
	address.sendKeys(addressValue);
	return this;
}
public ManageDeliveryBoyPage userName(String userNameValue2)
{
	userName.sendKeys(userNameValue2);
	return this;
}
public ManageDeliveryBoyPage password(String passwordValue2)
{
	password.sendKeys(passwordValue2);
	return this;
}
public ManageDeliveryBoyPage scrollPage()

{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	return this;
}

public ManageDeliveryBoyPage saveDetails()
{
	Actions act = new Actions(driver);
    act.moveToElement(save).perform();
	save.click();
	return this;
}

public boolean alertuser() 
{
 return userAlert.isDisplayed();
}

}

