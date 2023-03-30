package package1Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestExample {
	
	

	 @Test(groups = {"smokeTestSuite", "regressionSuite"})
	    public void testPrintMessage() {
	        System.out.println("testPrintMessage");
	    }
	    
	    
	    
	    @Test(groups = "smokeTestSuite")
	    public void testPrintName() {
	        System.out.println("testPrintName");

	    }
	    
	    
	    @Test(groups = "regressionSuite")
	    public void testPrintAge() {
	        System.out.println("testPrintAge");

	    }
	    
	    @Test(groups = "funTest")
	    public void testPrintAnything() {
	        System.out.println("testPrintAnything");

	    }
	    
	    
	
	
}
