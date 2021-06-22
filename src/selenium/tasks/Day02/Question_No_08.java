package selenium.tasks.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		WebElement txtusername = driver.findElement(By.name("username"));
//		
//		txtusername.sendKeys("8008316863");
//		
//		WebElement txtpassword = driver.findElement(By.name("password"));
//		
//		txtpassword.sendKeys("confidential");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@name='username']"));
		
		js.executeScript("arguments[0].setAtrribute('8008316863')", txtusername);
		
//		txtusername.sendKeys("8008316863");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='password']"));
		
		txtpassword.sendKeys("confidential");
		
		driver.quit();
	}

}
