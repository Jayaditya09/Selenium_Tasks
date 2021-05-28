package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_06 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement btnsign = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btnsign.click();
		
		WebElement btnsign2 = driver.findElement(By.xpath("//div[@id='hc']"));
		btnsign2.click();
		Thread.sleep(400);
		WebElement txtnum = driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[2]"));
		txtnum.sendKeys("8008316863");
		
		WebElement btnchck = driver.findElement(By.xpath("(//div[@role='presentation'])[@class='recaptcha-checkbox-border']"));
		btnchck.click();
		
		
		
	}

}
