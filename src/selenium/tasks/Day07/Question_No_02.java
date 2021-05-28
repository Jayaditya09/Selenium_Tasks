package selenium.tasks.Day07;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Question_No_02 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", target);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		Thread.sleep(5000);
		
		File capture = ts.getScreenshotAs(OutputType.FILE);
		
		File f =new File("E:\\Software Testing\\Output ScreenShots\\Day7_Q2.jpg");
		
		FileHandler.copy(capture, f);
		
		
		
	}
	

}
