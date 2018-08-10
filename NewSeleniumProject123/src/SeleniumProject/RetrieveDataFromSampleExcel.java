package SeleniumProject;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RetrieveDataFromSampleExcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
           Workbook excel= Workbook.getWorkbook(new File("E:\\Technical\\Selenium_Java\\ExcelSample.xls"));
           Sheet sh=excel.getSheet("Sheet1");
           System.out.println(sh.getColumns());
           System.out.println(sh.getRows());
   		
   
   			for(int i=0;i<sh.getRows();i++)
   			{
   				
   	   		for(int j=0;j<sh.getColumns();j++)
   	   		{
   	   			System.out.println(sh.getCell(j, i).getContents());
   	   		}
   	   			
   			}
   			
	}
	}
