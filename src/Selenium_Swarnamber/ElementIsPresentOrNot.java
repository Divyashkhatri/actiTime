package Selenium_Swarnamber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIsPresentOrNot {
	static WebDriver driver;
	public static void main(String[] args) {
		
	driver=new FirefoxDriver();
	isElementPresent(""); 
	}

static boolean isElementPresent(String path)
{
	try
	{
		driver.findElement(By.xpath(path));
		return true;
	}
	catch(Exception e)
	{
		return false;
	}

}
}
