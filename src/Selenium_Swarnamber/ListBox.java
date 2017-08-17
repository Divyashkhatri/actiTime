package Selenium_Swarnamber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///D:/All_sel_data/selenum_notes/html_pages/dropdownlist.html");
		WebElement e = driver.findElement(By.id("mlb"));

		e.findElement(By.xpath("//option")).click();
		e.findElement(By.xpath("(//option)[2]")).click();
		e.findElement(By.xpath("(//option)[3]")).click();
		e.findElement(By.xpath("(//option)[4]")).click();
		e.findElement(By.xpath("(//option)[5]")).click();
		e.findElement(By.xpath("(//option)[6]")).click();
		Thread.sleep(2000);
for(int i =1;i<=6;i++)
		e.findElement(By.xpath("//option["+i+"]")).click();

//		e.findElement(By.xpath("(//option)[2]")).click();
//		e.findElement(By.xpath("(//option)[3]")).click();
//		e.findElement(By.xpath("(//option)[4]")).click();
//		e.findElement(By.xpath("(//option)[5]")).click();
//		e.findElement(By.xpath("(//option)[6]")).click();
	//			e.findElement(By.xpath("(//option[.='poori'])[2]")).click();
//			e.findElement(By.xpath("(//option[.='poori'])[2]")).click();
	}

}
