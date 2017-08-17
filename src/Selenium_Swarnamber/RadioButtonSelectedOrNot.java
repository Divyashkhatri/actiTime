package Selenium_Swarnamber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSelectedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		String usename="//input[@name='username']";
		String password="//input[@name='pwd']";
		driver.findElement(By.xpath(usename)).sendKeys("admin");
		driver.findElement(By.xpath(password)).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[.='REPORTS']"));
		
		//write a program to check radiobutton is selected in group
		List<WebElement> lstradios=driver.findElements(By.xpath("//input[@name='allUsers']"));
		
		for(int i=0;i<lstradios.size();i++)
		{
			if(lstradios.get(i).isSelected())
			{
				//System.out.println("radio button "+i+" is selected");
				System.out.println("radio buuton "+lstradios.get(i).getAttribute("id")+"is selected");
			}
		}
				
		
		

	}

}
