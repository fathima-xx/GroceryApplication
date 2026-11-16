package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	@Test(description="user is trying to logout successfully")
	public void verifyWheatherUserIsAbleToSuccessfullyLogOut() throws IOException
	{
		HomePage hp;
		String usernamevalue = ExcelUtility.getStringData(1,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();
		
		
		hp.adminButton();
		lp=hp.clickLogout();
		//hp.Info();
		String actual=lp.verifyLoginTextIsDisplayed();
		String expected="7rmart supermarket";
		Assert.assertEquals(actual, expected, Constant.LOGOUTERROR);
		//String actual1 = hp.adminUserTextDisplay();
		//String expected = "Admin Users";
		//Assert.assertEquals(actual1, expected,"user is in the admin user page");
		
	}
	

}