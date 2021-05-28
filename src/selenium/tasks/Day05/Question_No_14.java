package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		
		Actions ac =new Actions(driver);
		Thread.sleep(300);
		WebElement mov1= driver.findElement(By.xpath("(//span[@class='catText'])[7]"));

		ac.moveToElement(mov1).perform();
		
		WebElement btnc1 = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		btnc1.click();
		
		WebElement btnc2 = driver.findElement(By.xpath("(//div[text()='Heels'])"));
		btnc2.click();
	}

}
