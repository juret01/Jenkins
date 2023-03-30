package package1Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTes1 {
	
	
	@Test
	@Parameters("myName")
	public void parameterTest(String myName ) {
		
	System.out.println("Paranmeteruzed value is : "+ myName );	
		
	}
	

}
