package testScript;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class ManageDeliveryBoyTest extends Base{
	HomePage hp;
	ManageDeliveryBoyPage  Mp;
	@Test(description="user is trying to add new delivery boy")
	public void verifyWhetherUserIsAbleToAddNewDeliveryBoy() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0,0,  "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsernameOnUsernameFeild(usernamevalue).enterPasswordOnPasswordFeild(passwordvalue);
		hp=lp.clickLoginbutton();

		 Mp=hp.boyInfo();
		
		{
			Mp.newBoy();
			RandomDataUtility rdu = new RandomDataUtility();
		    String name = rdu.generateRandomUsername();
		    String emailid = rdu.generateRandomEmailID();
		    String phone = rdu.generateRandomPhonenumber();
		    String address = rdu.generateRandomAddress();
		    String userName = rdu.generateRandomUsername();
		    String password = rdu.generateRandomPassword();
		    Mp.name(name).emailid(emailid).phone(phone).address(address).userName(userName).password(password).scrollPage().saveDetails();
		    
		    boolean alertText = Mp.alertuser();
			Assert.assertTrue(alertText, Constant.ALREADYEXISTSERROR);
			
		}
	}

}
