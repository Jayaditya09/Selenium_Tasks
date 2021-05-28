package selenium.tasks.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolltarget = driver.findElement(By.xpath("(//div[text()='Share this page'])"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolltarget);
		
		WebElement scrolldst = driver.findElement(By.xpath("(//span[text()='Latest Tutorials'])"));
		js.executeScript("arguments[0].scrollIntoView(false)",scrolldst);
		
		driver.quit();
	}

}
