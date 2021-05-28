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

public class Question_No_09 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement txtscearch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		
		txtscearch.sendKeys("Iphone");
		
		
		
		Robot rb =new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(500);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		File f =new File("E:\\Software Testing\\Output ScreenShots\\iphone.jpeg");
		
		FileHandler.copy(ss, f);
		
		driver.close();
	}

}
