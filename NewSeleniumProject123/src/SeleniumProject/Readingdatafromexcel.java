package SeleniumProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\Technical\\Selenium_Java\\sampletextfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sh=workbook.getSheet("Login");
		
		XSSFRow row=sh.getRow(0);
		XSSFCell cell=row.getCell(0);
		
		System.out.println("value of call is"+cell);
		
	}

}
