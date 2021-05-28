package selenium.tasks.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_05 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtuserid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		txtuserid.sendKeys("aditya");
		
		//driver.quit();
	}

}
