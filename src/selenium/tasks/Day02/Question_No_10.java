package selenium.tasks.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("username"));
		
		txtusername.sendKeys("8008316863");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		
		txtpassword.sendKeys("confidential");
		System.out.println(txtpassword.getAttribute("value"));
		driver.quit();
	}

}
