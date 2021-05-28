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
import org.openqa.selenium.interactions.Actions;

public class Question_No_01 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?ref=icp_country_us");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.xpath("(//span[contains(text(),'iPhone 12 Mini')])[1]"));
		//link.click();
		Actions ac = new Actions(driver);
		ac.contextClick(link).perform();
		Robot rb= new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for (String string : allwin) {
			if(!parentwin.equals(string))
			{
				driver.switchTo().window(string);
			}
		}
		//Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_dealprice']"));
		String text = price.getText();
		
		System.out.println("Price :"+text);
	}

}
