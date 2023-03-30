package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.BaseClass;

public class AdminPageMenuList {
	
	
	public AdminPageMenuList() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
	
	
	 @FindBy(xpath="//*[@class='oxd-topbar-body']/nav/ul/li")
	    public List<WebElement> AdminPageMenuLists;
	    
	 @FindBy(xpath="//*[@class='oxd-table-body']/div")
	    public List<WebElement> AdminNationalitiesList;
	//*[@class='oxd-input oxd-input--focus']
	 
	 @FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--secondary'] ")
	    public WebElement  AddButon;
	
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	    public WebElement  sendKeyaddresButton;
	 
//	 @FindBy(xpath="//input[@class='oxd-input oxd-input--focus']")
//	    public WebElement  sendKeyaddresButton;
 
	 
	 @FindBy(xpath="//*[@type='submit']")
	    public WebElement  SaveButon;
	 
	 
//	  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[1]/div/div/label/span")
//	    public WebElement  trashBin;
	 
	  
	  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]//div/div[3]//div[2]/div[15]//div[3]/div/button[1]/i")
	  public WebElement deleteButton;
	  
	  
	
	 public void AdminPageMenu(String adminPageValue) {
		 
	        for (WebElement NationwithA :  AdminPageMenuLists) {
	            System.out.println(NationwithA);
	        	if( NationwithA.getText().equalsIgnoreCase(adminPageValue)) {
	        		NationwithA.click();
	        	
	        		
	        	for (WebElement NationwithB :  AdminNationalitiesList) {
	        		 
	            if (!NationwithB.getText().contains(BaseClass.getProperty("adminPageValue"))) {
	            	AddButon.click();
	            	
	            	sendKeyaddresButton.click();
	            	sendKeyaddresButton.sendKeys(BaseClass.getProperty("adminPageValue"));
	            	SaveButon.click();
	             break;	
	            }
	            	
	            else  if (NationwithB.getText().contains(BaseClass.getProperty("adminPageValue"))) {
	            		System.out.println("The input nationality arlready exest ");
	            		
	            }
	          
	            }	
	            
	             
	        }
	        	}//for	 
	        	 
	        
	        
	    }//end for
	    
	
	
	 public void deleteNationality(String deletedValue) {
		 
	        for (WebElement NationwithAA :  AdminNationalitiesList) {
	        	System.out.println(NationwithAA.getText());
//	        	if( NationwithA.getText().equalsIgnoreCase((BaseClass.getProperty("adminPageValue")))) {
//	        		deleteButton.click();
//	        		System.out.println(NationwithA.getText());
//	        	}
//	        	 break;
	        	}
	 }

}
