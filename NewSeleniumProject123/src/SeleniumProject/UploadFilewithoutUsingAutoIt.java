package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilewithoutUsingAutoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://convertonlinefree.com/");
		driver.findElement(By.id("MainContent_fu")).sendKeys("E:\\Technical\\Selenium_Java\\Concept Analysis.docx");
		driver.findElement(By.id("MainContent_btnConvert")).click();

	}

}
