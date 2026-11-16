package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddCategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddCategoryTest extends Base{
	HomePage hp;
	AddCategoryPage acp;
	@Test(description="user is trying to add new category")
	public void verifyWheatherUserIsAbleToAddNewCategory() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();
		
		acp=hp.catinfo();
		acp.newcat().category("bee").select().uploadFile().scrollPage().save();
		boolean alertText = acp.successalert();
		Assert.assertTrue(alertText, Constant.CATEGORYEXISTSERROR);
		
			
	}

	@Test(description="user is trying to sreach new category")
	public void verifyWheatherUserIsAbleToSreachNewCategory() throws IOException 
	{
		String usernamevalue = ExcelUtility.getStringData(0,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();
		
		acp=hp.catinfo();
		 acp.search().categorysreach("carrot").redsearch();
		 boolean alertText = acp.alertfound();
			Assert.assertTrue(alertText, Constant.NOTFOUNDERROR);
			
		
	}


}



