package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void bmet()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shop.thetestingworld.com/");
		driver.findElement(By.name("search")).sendKeys("IPhone");
		driver.findElement(By.xpath("//div[@id='search']/span/button[@class='btn btn-default btn-lg']")).click();
		driver.quit();
	}
	
}
