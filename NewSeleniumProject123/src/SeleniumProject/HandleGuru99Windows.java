package SeleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGuru99Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String>windows=driver.getWindowHandles();
		
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext())
		{
			String ChildId=itr.next();
			
			driver.switchTo().window(ChildId);
			System.out.println(ChildId);
			System.out.println(driver.getTitle());
			
			if(!ChildId.equals(parentId))
			{
				driver.switchTo().window(ChildId);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.2n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			driver.switchTo().window(parentId);
			
		}
		
		
	}

}
