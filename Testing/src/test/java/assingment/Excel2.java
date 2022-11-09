package assingment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel2{
	@Test
	public void readsheetdata() throws IOException {
		//create instance of FileInputstream class and pass the required excel file location to its constructor
		FileInputStream fis= new  FileInputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
		//create an instance of required workbook class and pass FileInputstream instance to its constructor
		Workbook work=new XSSFWorkbook(fis);
		//get the number of sheets present in the excel file
		int sheetcount=work.getNumberOfSheets();
		System.out.println("Number of sheets: "+sheetcount);
		//print all the sheets name from excel
		for(int i=0;i<sheetcount;i++) {
		String sheetname=work.getSheetName(i);
		System.out.println("sheet name is "+ sheetname);
		}
		Sheet sheet=work.getSheet("TC");
	}
	@Test
	public void getrowDetails()throws IOException {
		//create an instance of FileInputstream class and pass the required excel file location to its constructor
		FileInputStream fis=new FileInputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
		//create an instance of required workbook class and pass FileInputstream instance to its constructor
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet from excel
		Sheet sheet=workbook.getSheet("TC");
		//get row count from the excel (rowcount=Actualcount-10=)
		int rowcount=sheet.getLastRowNum();
		System.out.println("rowcount "+rowcount);
		Row row=sheet.getRow(1);
	}
	@Test
	public void GetCellDetails()throws IOException {
		//create an instance of FileInputstream class and pass the required Excel file location to its constructor
		FileInputStream file=new FileInputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
		//create an instance of workbook class and pass FileInputstream instance to its constructor
		Workbook workbook=new XSSFWorkbook(file);
		//get the required sheet from workbook
		Sheet sheet=workbook.getSheet("TC");
		//get specific row from the sheet
		Row row=sheet.getRow(4);
		//get the cell count count from the row
		int cellcount=row.getLastCellNum();
		System.out.println("cell count on row 4 " +cellcount);
		//get cell-2 data from row 3
		Cell cell=row.getCell(2);
		//get all cell data from row2
		for(int i=0;i<cellcount;i++) {
			Cell col=row.getCell(i);
			String cellData=col.getStringCellValue();
			System.out.println("cell data "+cellData);
			//System.out.println("cell data " +row.getCell(i).getStringCellValue());	
		}
	}
	@Test
	public void GetDiffTypeOfCellData()throws IOException {
		
		FileInputStream f=new FileInputStream("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx");
		Workbook workbook=new XSSFWorkbook(f);
		Sheet sheet =workbook.getSheet("TC");
		Row row=sheet.getRow(0);
		int cellcount=row.getLastCellNum();
		System.out.println("Cell count is "+cellcount);
		Cell cell=row.getCell(2);
		for(int i=0;i<cellcount;i++) {
			//System.out.println("cell data "+row.getCell(i).getStringCellValue());
		Cell cell2=row.getCell(i);
		switch(cell.getCellType()) {
		case(Cell.CELL_TYPE_STRING):
		System.out.println("The cell is string "+cell2.getStringCellValue());
		break;
		case(Cell.CELL_TYPE_BOOLEAN):
			System.out.println("The cell is boolean "+cell2.getStringCellValue());
		break;
		case(Cell.CELL_TYPE_NUMERIC):
			System.out.println("cell data "+cell2.getStringCellValue());
		break;
		default:
			System.out.println("the cell data is invalid ");
			break;
		
		
		
		}
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



