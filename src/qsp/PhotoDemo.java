package qsp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhotoDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement element = driver.findElement(By.xpath("//td[@id='logoContainer']//img"));
		File screenshotsrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshot/xyz.png");
		
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();
		Dimension dimension = element.getSize();
		int h = dimension.getHeight();
		int w = dimension.getWidth();
		
		BufferedImage dest = ImageIO.read(screenshotsrc).getSubimage(x, y, w, h);
	
		ImageIO.write(dest,"png", screenshotsrc);
		
		FileUtils.copyFile(screenshotsrc, destFile);
		
	}
}