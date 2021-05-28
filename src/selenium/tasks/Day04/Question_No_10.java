package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();

		WebElement txtsearch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		txtsearch.sendKeys("iphone");

		WebElement btnsearch = driver.findElement(By.xpath("//button[@type='submit']"));
		btnsearch.click();

		WebElement btnclick = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 11 (Black, 64 GB)']"));
		btnclick.click();

		driver.quit();
	}

}
