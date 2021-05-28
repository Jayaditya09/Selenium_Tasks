package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		Actions ac =new Actions(driver);
		Thread.sleep(300);
		
		WebElement mov1= driver.findElement(By.xpath("//div[text()='Appliances']"));

		ac.moveToElement(mov1).perform();
		
		WebElement mov2= driver.findElement(By.xpath("//a[text()='Televisions']"));

		ac.moveToElement(mov2).perform();
		Thread.sleep(400);
		WebElement btnc1 = driver.findElement(By.xpath("//a[text()='All']"));
		btnc1.click();
		
		Thread.sleep(200);
		
		WebElement btnc2 = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[4]"));
		btnc2.click();
		
//		WebElement btnc3 = driver.findElement(By.xpath("//a[text()='Mi 4A 100 cm (40 inch) Full HD LED Smart Android TV wit...']"));
//		btnc3.click();
		
		

	}

}
