package selenium.tasks.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.xpath("(//span[@class='labelColumn'])[1]"));
		
		txtusername.sendKeys("8008316863");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		
		txtpassword.sendKeys("confidential");
		
//		WebElement txtusername = driver.findElement(By.className("login-input type_UserPrincipal"));
//		
//		txtusername.sendKeys("8008316863");
//		
//		WebElement txtpassword = driver.findElement(By.className("login-input-password"));
//		
//		txtpassword.sendKeys("confidential");
		
		//driver.quit();
	}

}
