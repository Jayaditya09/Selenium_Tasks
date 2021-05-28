package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_04 {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		driver.manage().window().maximize();


		WebElement home = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));

		Actions ac =new Actions(driver);
		ac.moveToElement(home).perform();
		
		WebElement clickphone = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		clickphone.click();
		Thread.sleep(300);
		
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		checkbox.click();
	}

}
