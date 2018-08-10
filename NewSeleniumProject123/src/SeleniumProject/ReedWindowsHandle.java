package SeleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReedWindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reed.co.uk/");
		String ParentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='site-header']/div[2]/div/ul/li[3]/a")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		
		while(itr.hasNext())
		{
			String Id=itr.next();
			driver.switchTo().window(Id);
			System.out.println(Id);
			System.out.println(driver.getTitle());
			
		}
	}

}
