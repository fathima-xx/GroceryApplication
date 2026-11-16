package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	public WebDriver driver;
	public AddCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newcategory;
	@FindBy(xpath="//input[@id='category']")WebElement entercategory;
	@FindBy(xpath="//li[@id='1-selectable']")WebElement selectcategory;
	@FindBy(xpath="//input[@id='main_img']")WebElement file;
	@FindBy(xpath="//html[@style='height: auto;']")WebElement scroll;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
	@FindBy(xpath="//input[@class='form-control']")WebElement categorysearch;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")WebElement redsearch;
	@FindBy(xpath="//span[@id='res']")WebElement alertfound;
	
	

public AddCategoryPage newcat() 
{
	newcategory.click();
	return this;
}
public AddCategoryPage category(String category)
{
    entercategory.sendKeys(category);
    return this;
}
public AddCategoryPage select()
{
	    selectcategory.click();
	    return this;
}
public AddCategoryPage uploadFile() 
{
	 	file.sendKeys("C:\\Users\\HP\\Downloads\\download (2).jpg");
	 	return this;
}
public AddCategoryPage scrollPage()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	return this;
}
public AddCategoryPage save()
{
	Actions act = new Actions(driver);
    act.moveToElement(save).perform();
	save.click();
	return this;
}
public boolean successalert() 
{
 return alert.isDisplayed();
}
public AddCategoryPage search() 
{
	search.click();
	return this;
}
public AddCategoryPage categorysreach(String category1)
{
	categorysearch.sendKeys(category1);
	return this;
}
public AddCategoryPage redsearch()
{
	redsearch.click();
	return this;
}
public boolean alertfound() 
{
 return alertfound.isDisplayed();
}


}
