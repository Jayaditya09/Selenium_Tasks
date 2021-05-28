package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(400);
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		txtsearch.sendKeys("mask");
		
		WebElement btnsearch = driver.findElement(By.xpath("//span[text()='Search']"));
		btnsearch.click();
		
		WebElement btnclick = driver.findElement(By.xpath("//span[text()='RESTOCKING SOON']"));
		btnclick.click();
		
		driver.quit();
	}

}
