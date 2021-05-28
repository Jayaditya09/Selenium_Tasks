package selenium.tasks.Day06;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_03 {

	public static void main(String[] args) throws InterruptedException, AWTException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement btnint = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btnint.click();
		
		Thread.sleep(500);
		
		WebElement btn = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		
		//btn.click();
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(btn).perform();
		
		Robot rb =new Robot();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
