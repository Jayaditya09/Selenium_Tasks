package selenium.tasks.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement txtusr = driver.findElement(By.id("username"));
		txtusr.sendKeys("qwerty");
		
		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys("qwerty");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()",btnlogin);
		driver.quit();
	}

}
