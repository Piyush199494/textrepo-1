package assingment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UpdateExcel {
	@Test
 public void Update()throws IOException {
	FileInputStream fis= new FileInputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
	Workbook workbook=new XSSFWorkbook(fis);
	Sheet sheet=workbook.getSheet("Sheet1");
	Row row =sheet.getRow(3);
	Cell cell=row.createCell(3);
	cell.setCellValue("Failed");
	//to store the update data find the location to save the file
	FileOutputStream fos=new FileOutputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
	workbook.write(fos);
	fos.close();
	System.out.println("File updated");
	
	
}
	

  }

