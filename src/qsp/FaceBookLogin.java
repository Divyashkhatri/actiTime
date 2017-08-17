package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("username@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("PASSWORD");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		driver.findElement(By.xpath("//a[@id='pageLoginAnchor']")).click();
		driver.findElement(By.id("pageLoginAnchor"));
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

}

