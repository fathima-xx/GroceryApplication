package testScript;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;


public class AdminUsersTest extends Base{
	
	HomePage hp;
	AdminUsersPage au;
	@Test(description="user is trying to add new admin user")
	public void verifyWhetherUserIsAbleToAddNewAdminUser() throws IOException
	{

		String usernamevalue = ExcelUtility.getStringData(0,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();
		au=hp.Info();

		
		au.newButton();
		RandomDataUtility rdu = new RandomDataUtility();
		
		String enterUsername = rdu.generateRandomUsername();
		String enterPasswordname = rdu.generateRandomPassword();
		au.enterUsername(enterUsername).enterPasswordname(enterPasswordname).select().clickSave();
		
		boolean alertText = au.alertDisplay();
		Assert.assertTrue(alertText, Constant.EXISTSERROR);
		
	}
	@Test(description="user is trying to sreach newly added admin user")
	public void verifyWhetherUserIsAbleToSearchTheNewlyAddedAdminUser() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();
		
		au=hp.Info();

		AdminUsersPage au = new  AdminUsersPage(driver);
		au.search();
		String username = ExcelUtility.getStringData(0, 0, "AdminUser");
		au.username(username).selectClick().searchUser();
		boolean alert = au.alertMsg();
		Assert.assertTrue(alert, Constant.RESULTNOTFOUNDERROR);
	}
		
}

/*TestCase:
 * verifyWhetherUserIsAbleToAddNewAdminUser
 * verifyWhetherUserIsAbleToSearchTheNewlyAddedAdminUser
 */
 