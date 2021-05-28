package selenium.tasks.Day07;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Question_No_07 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));
		
		btn.click();
		
		Robot rb =new Robot();
		for (int i = 0; i < 16; i++) {
			
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(500);
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("E:\\\\Software Testing\\\\Output ScreenShots\\interview.jpeg");
		
		FileHandler.copy(ss, f);
		
		driver.quit();
		
	}

}
