package Utilitiez;

import java.io.IOException;

public class TestingExcelUtility {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		  Object[][] data = ExcellUtility.readExcelFile(Constants.exelDocument_path, "Sheet1");
	        
	        
	        
	        
	        for (int i = 0; i < data.length; i++) {
	            for (int j = 0; j < data[i].length; j++) {
	                System.out.print(data[i][j] + " ");
	                System.out.println();
	            }
	             System.out.println();
	        }

	    }	
		

	}


