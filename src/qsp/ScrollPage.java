package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Enter mailid and password and execute the script
		String mailid="";
		String PASSWORD="";
				
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		driver.get("http://facebook.com");driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mailid);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(PASSWORD+Keys.ENTER);
		while(true)
		{
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
			Thread.sleep(100l);
		}

	}

}
