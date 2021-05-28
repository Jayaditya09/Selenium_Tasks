package selenium.tasks.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Finding the locator id of facebook username textbox
		WebElement txtusername = driver.findElement(By.id("email"));
		//sending the key(username)
		txtusername.sendKeys("8008316863");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		//sending the password
		txtpassword.sendKeys("confidential");
		driver.quit();
		
	}

}
