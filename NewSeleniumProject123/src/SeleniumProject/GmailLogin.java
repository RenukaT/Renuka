package SeleniumProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"E:\\Technical\\Selenium_Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.gmail.com/");
			driver.findElement(By.id("identifierId")).sendKeys("tellakula.renu@gmail.com");
			driver.findElement(By.xpath(".//span[text()='Next']")).click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.name("password")).sendKeys("renusatya");
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//span[text()='Next']")).click();
			driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("to")).sendKeys("satya.tellakula@gmail.com");
			driver.findElement(By.id(":nm")).sendKeys("Payslip");
			driver.findElement(By.id(":or")).sendKeys("Automatic mail");
			driver.findElement(By.id(":pc")).click();
			Thread.sleep(10000);
			Runtime.getRuntime().exec("E:\\Technical\\Selenium_Java\\SamplePDF.exe");
			Thread.sleep(3000);
			driver.findElement(By.id(":nc")).click();
			
	}

}
