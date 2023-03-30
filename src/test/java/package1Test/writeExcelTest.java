package package1Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcelTest {

	public static void main(String[] args) throws IOException  {

		

		FileInputStream fs = new FileInputStream("/Users/juret01/Desktop/TechCircle.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		//XSSFSheet sheet =  workbook.getSheet("Sheet1");
		XSSFSheet sheet =  workbook.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		   for(int i = 0; i<= lastRowNum; i++) {
               Row row = sheet.getRow(i);
               //Row row = sheet.createRow(i);
               Cell cell = row.createCell(6);
               
               cell.setCellValue("Hello, hows the project going");
       
           
       }
       
       FileOutputStream fos = new FileOutputStream("/Users/techcircle/Desktop/Techcircle.xlsx");
       
       workbook.write(fos);
       
       fos.close();

		
		
	}

}
