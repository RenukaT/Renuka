package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceActionclasse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		//Thread.sleep(5000);
		  //Actions action = new Actions(driver);
 //action.moveToElement(driver.findElement(By.xpath("//a[@title='Electronics']"))).build().perform();
 //Thread.sleep(5000);
 //driver.findElement(By.xpath("(//a[@title='Samsung'])[1]")).click();
		driver.get("https://www.moonpig.com/uk/");
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//span[text()='flowers & plants']"))).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='Birthday'])[2]")).click();
 
		 
	}

}
