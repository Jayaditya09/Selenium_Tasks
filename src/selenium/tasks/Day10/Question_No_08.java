package selenium.tasks.Day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_08 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.id("inputValEnter"));
		txtsearch.sendKeys("hand sanitizer",Keys.ENTER);

		WebElement link = driver.findElement(By.xpath("//p[contains(text(),'Dr Rhazes alcohol based Hand Sanitizer 500 mL Pack of 2')]"));
		link.click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		Thread.sleep(500);
		for (String string : allwin) {
			if(!parentwin.equals(string))

			{
				driver.switchTo().window(string);
			}
		}


		WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addtocart.click();

		driver.quit();
	}

}
