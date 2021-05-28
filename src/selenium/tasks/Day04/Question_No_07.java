package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_07 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@title='Search']"));
		txtsearch.sendKeys("greens velmurugan");
		
		WebElement btnsearch = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
		btnsearch.click();
		
		WebElement link = driver.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager - GTL Limited | LinkedIn']"));
		link.click();
		
		}

}
