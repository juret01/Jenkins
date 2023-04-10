package package1Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListsennersTestNG.class)
public class tester_LessennerTest {
	
	WebDriver driver;
	Select select;
	
	@Test	//failed Test
	
	public void openBrowser() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://the-internet.herokapp.com/dropdown");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	String expectedtitle = "TechCircle Shool";
	String actual_originalTitle = driver.getTitle();
	
	AssertJUnit.assertEquals(actual_originalTitle,expectedtitle);
	
	
		}
	
}


