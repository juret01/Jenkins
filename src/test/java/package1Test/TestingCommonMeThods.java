package package1Test;

import Utilitiez.BaseClass;
import Utilitiez.CommonMethods;
import pages.LoginPage;

public class TestingCommonMeThods {

	
static LoginPage lp;
	
	
	public static void main(String[] args) {
		lp = new LoginPage();
		
		CommonMethods.sendText(lp.userTextBox, BaseClass.getProperty("username"));
	
	}

}
