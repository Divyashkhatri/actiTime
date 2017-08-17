package Selenium_Swarnamber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowserDynamically {

	public static void main(String[] args) {
		String browsername="ie";
		String key="";
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","./driver/IEdriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefor"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		
		
		driver.get("http://localhost/login.do");
		String usename="//input[@name='username']";
		String password="//input[@name='pwd']";
		driver.findElement(By.xpath(usename)).sendKeys("admin");
		driver.findElement(By.xpath(password)).sendKeys("manager");

			

	}

}
