package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		driver.manage().window().maximize();
		WebElement mov = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		
		Actions ac =new Actions(driver);
		
		ac.moveToElement(mov).perform();
		
		WebElement btngrain = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		
		btngrain.click();
	}

}
