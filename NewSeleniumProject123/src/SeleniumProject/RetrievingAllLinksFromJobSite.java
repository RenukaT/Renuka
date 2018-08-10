package SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingAllLinksFromJobSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.jobsite.co.uk/");	
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
		{
		System.out.println(Links.get(i).getText());
		System.out.println("-----------------");
		System.out.println(Links.get(i).getAttribute("href"));
		}
	}

}
