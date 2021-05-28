package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement actioncourse = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions ac =new Actions(driver);
		ac.moveToElement(actioncourse).perform();
		
		WebElement btnreg = driver.findElement(By.xpath("(//span[text()='Register'])[1]"));
		btnreg.click();
		
		Thread.sleep(900);
		
		WebElement txtusr = driver.findElement(By.xpath("(//input[@class='hidden ghost-input'])[1]"));
		
		txtusr.sendKeys("8008316863");
		
		WebElement btncnt = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		btncnt.click();
	}

}
