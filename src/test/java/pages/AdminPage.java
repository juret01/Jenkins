package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.BaseClass;

public class AdminPage {
	
	public AdminPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
	
	//*[@class='oxd-select-dropdown --positon-bottom']/div
    @FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input")
    public WebElement systemUsersUsernameTextBox;
    
    
   
    
    @FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
    public WebElement userRoleDropDownToExpand;
    
    //Dinamic one xpath
    //*[@class="oxd-grid-4 orangehrm-full-width-grid"]/div
    @FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[4]/div/div[2]/div/div")
    public WebElement statusDropDownToExpand;
    
    
    @FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']/div")
    public List<WebElement> userRoleAndStatusDropDownOptions;
    
    
    @FindBy (xpath="//*[@type=\"submit\"]")
    public WebElement SearchButton;
    
    @FindBy (xpath="//div[@class='oxd-table-card']/div")
    public List<WebElement> recordsTable;
   
   
   
    
    
    public void chooseUserRoleOption(String menuValue) {
        for (WebElement userRoleOption : userRoleAndStatusDropDownOptions) {
            
            if (userRoleOption.getText().equalsIgnoreCase(menuValue)) {
                userRoleOption.click();
                break;
            }
            
        }
    
    
    }
    
    }
