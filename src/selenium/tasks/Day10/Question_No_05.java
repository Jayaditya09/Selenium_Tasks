package selenium.tasks.Day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_05 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(courses).perform();
		JavascriptExecutor script=(JavascriptExecutor)driver;
		
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		python.click();
		
		Thread.sleep(1000);
		
		WebElement cur = driver.findElement(By.xpath("(//h2[text()='Curriculum'])"));
		script.executeScript("arguments[0].scrollIntoView(true)",cur);
		
		
		ac.contextClick(cur).perform();
		
		Thread.sleep(1000);
		
		Robot rb =new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
