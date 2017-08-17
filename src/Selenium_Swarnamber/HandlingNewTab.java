package Selenium_Swarnamber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://localhost/login.do");

	}

}
