package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingDataFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");
		driver.findElement(By.id("htmlTableId"));
		List<WebElement>rows=driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		System.out.println(rows.size());
	
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			List<WebElement>cols1=rows.get(i).findElements(By.tagName("th"));
			
			for(int k=0;k<cols1.size();k++)
			{
			System.out.println(cols1.get(k).getText());
			}
			
			for(int j=0;j<cols.size();j++)
			{
				System.out.println(cols.get(j).getText());
			}
		  
		}
	}

}