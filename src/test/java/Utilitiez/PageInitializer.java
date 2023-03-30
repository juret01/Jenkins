package Utilitiez;

import pages.AdminPage;
import pages.AdminPageMenuList;
import pages.LoginPage;
import pages.NavigationMenuPage;

public class PageInitializer extends BaseClass{
	
	
	
	public static AdminPageMenuList aMenu;
	public static LoginPage lp;
	public static AdminPage ap;
	public static NavigationMenuPage nmp;
    
    
    public static void initailize() {
    	
    	 BaseClass.getDriver();
	        lp  = new  LoginPage();
	        ap  = new  AdminPage();
	        nmp = new  NavigationMenuPage();
	        aMenu=new  AdminPageMenuList();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
