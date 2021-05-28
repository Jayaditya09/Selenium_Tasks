package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.flipkart.com");

		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		
		
		
		Actions ac =new Actions(driver);
		ac.moveToElement(home).perform();
		
		WebElement bath = driver.findElement(By.xpath("//a[text()='Bath linen']"));
		
		bath.click();
		
		Thread.sleep(300);
		
		WebElement prdct = driver.findElement(By.xpath("(//a[text()='VEL Cotton 200 GSM Bath Towel Set'])[2]"));
		
		System.out.println(prdct.getText());
		
		
	}

}
