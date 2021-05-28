package selenium.tasks.Day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement txtscearch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		
		txtscearch.sendKeys("redmi phone",Keys.ENTER);
		Thread.sleep(1000);
		WebElement webElement = driver.findElement(By.xpath("//div[contains(text(),'REDMI Note 9 (Arctic White, 64 GB)')]"));
		webElement.click();
		
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
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String string = price.getText();
		System.out.println(string);
		
		driver.quit();
	}

}
