package selenium.tasks.Day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();

		WebElement txtscearch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));

		txtscearch.sendKeys("mask",Keys.ENTER);
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Gear OXYMAX Adult 6 Layer Reusable Outdoor ACCOXMOD03M1...')]"));
		findElement.click();

		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		Thread.sleep(500);

		for (String string : allwin) {
			if(!parentwin.equals(string))

			{
				driver.switchTo().window(string);
			}
		}

		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pincodeInputId"));
		
		pin.click();
		Robot rb =new Robot();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_X);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_X);
		pin.sendKeys("600079",Keys.ENTER);

		//driver.quit();
	}

}
