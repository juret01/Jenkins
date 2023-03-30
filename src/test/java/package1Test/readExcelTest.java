package package1Test;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelTest {

	public static void main(String[] args) throws Exception {

		
		FileInputStream fs = new FileInputStream("/Users/juret01/Desktop/TechCircle.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
//		
//		Row row =sheet.getRow(6);
//		Cell cell = row.getCell(4);
//		
//		System.out.println(cell);
//		
		
		
		for (Row row : sheet) {

            for (Cell cell : row) {
//                System.out.println(cell.getStringCellValue());
                switch (cell.getCellType()) {
                
                case BOOLEAN:
                    System.out.println(cell.getBooleanCellValue());
                    break;
                case NUMERIC:
                    System.out.println(cell.getNumericCellValue());
                    break;
                case STRING: 
                    System.out.println(cell.getRichStringCellValue());
                    break;
                case FORMULA:
                    System.out.println(cell.getCellFormula());
                    break;
                }
                System.out.println(" ");

            }

        }
			
			
			
		}
		
		
	}


