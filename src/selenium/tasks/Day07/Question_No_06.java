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

public class Question_No_06 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement target = driver.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends In 2020')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", target);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		Thread.sleep(500);
		
		File capture = ts.getScreenshotAs(OutputType.FILE);
		
		File f =new File("E:\\Software Testing\\Output ScreenShots\\Day7_Q6.jpg");
		
		FileHandler.copy(capture, f);
	}

}
