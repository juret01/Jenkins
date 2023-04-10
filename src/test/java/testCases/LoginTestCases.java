package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilitiez.BaseClass;
import Utilitiez.CommonMethods;

public class LoginTestCases extends CommonMethods {

	@BeforeTest
	public void beforeTest() {
		BaseClass.getDriver();
	}
	
	@Test
	public void testAdminSystemUserSearch() {

//		        lp.userTextBox.sendKeys(BaseClass.getProperty("username"));
//		        lp.passwordTextBox.sendKeys(BaseClass.getProperty("password"));
//		        lp.LoginButton.click();

		lp.loginMethod();
		nmp.chooseLeftMenuBarOption(BaseClass.getProperty("admin"));
		ap.systemUsersUsernameTextBox.sendKeys(BaseClass.getProperty("SystemUserUsername"));

		ap.userRoleDropDownToExpand.click();
		ap.chooseUserRoleOption(BaseClass.getProperty("SystemRole"));

		ap.statusDropDownToExpand.click();
		ap.chooseUserRoleOption(BaseClass.getProperty("enabled"));
		ap.SearchButton.click();

		aMenu.AdminPageMenu((BaseClass.getProperty("nationalities")));

		aMenu.sendKeyaddresButton.sendKeys(BaseClass.getProperty("adminPageValue"));

		aMenu.deleteNationality((BaseClass.getProperty("adminPageValue")));

		AssertJUnit.assertTrue(ap.recordsTable.size() != 1);

	}

}
