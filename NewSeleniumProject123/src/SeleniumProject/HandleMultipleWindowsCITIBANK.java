package SeleniumProject;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindowsCITIBANK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		String ParentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
		Set<String>windows=driver.getWindowHandles();
		
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext())
		{
			String Id=itr.next();
			driver.switchTo().window(Id);
			System.out.println(Id);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			
			if(driver.getTitle().contains("Citibank India"))
			{
				driver.findElement(By.xpath("//div[@class='cl fl ls_login']")).click();
					}
					
			if(!Id.equals(ParentId))
			{
				driver.close();
			}
		
		driver.switchTo().window(ParentId);
		}
	}

}