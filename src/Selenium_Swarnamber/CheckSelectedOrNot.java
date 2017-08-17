package Selenium_Swarnamber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelectedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://localhost/login.do");
		driver.navigate().to("file:///D:/input.html");
//		String usename="//input[@name='username']";
//		String password="//input[@name='pwd']";
//		driver.findElement(By.xpath(usename)).sendKeys("admin");
//		driver.findElement(By.xpath(password)).sendKeys("manager");
//		// selecting 3 and 4 checkbox
//		List<WebElement> lstcheckbox=driver.findElements(By.xpath("//input[@type='Checkbox']"));
//		lstcheckbox.get(2).click();
//		lstcheckbox.get(3).click();
//		// check wheather checkbox is selected or unselected
//		for(int i=0;i<lstcheckbox.size();i++)
//		{
//			if(lstcheckbox.get(i).isSelected())
//			{
//				System.out.println("Checkbox "+i+"  Selected");
//			}
//			else
//			{
//				System.out.println("Checkbox "+i+" Not Selected");
//			}
//		}
	}

}
