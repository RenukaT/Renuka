package SeleniumProject;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RetrievingDataFromExcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		Workbook obj=Workbook.getWorkbook(new File("E:\\Technical\\Selenium_Java\\ExcelSample.xlsx"));
		Sheet sh=obj.getSheet("sheet1");

for(int i=0;i<sh.getRows();i++)
{
	System.out.println(sh.getCell(0, i).getContents());
}
	}

}
