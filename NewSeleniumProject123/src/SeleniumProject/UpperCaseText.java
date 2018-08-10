package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpperCaseText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical\\Selenium_Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		
		Actions obj=new Actions(driver);
		obj.moveToElement(email);
		obj.keyDown(Keys.SHIFT);
		obj.sendKeys("hello").keyUp( Keys.SHIFT).doubleClick(email).contextClick().build().perform();
	}

}
