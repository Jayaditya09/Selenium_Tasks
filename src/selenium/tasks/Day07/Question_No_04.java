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

public class Question_No_04 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", target);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		Thread.sleep(500);
		
		File capture = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("E:\\Software Testing\\Output ScreenShots\\greens.png");
		
		FileHandler.copy(capture, f);

	}

}
