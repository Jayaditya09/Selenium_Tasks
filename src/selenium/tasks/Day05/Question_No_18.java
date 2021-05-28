package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		Actions ac =new Actions(driver);
		Thread.sleep(300);
		
		WebElement mov1= driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));

		ac.moveToElement(mov1).perform();
		
		WebElement mov2= driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));

		ac.moveToElement(mov2).perform();
		
		WebElement btnc1 = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		btnc1.click();

	}

}
