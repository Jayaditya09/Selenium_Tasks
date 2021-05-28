package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		driver.manage().window().maximize();

		WebElement txtsearch = driver.findElement(By.id("autocomplete"));
		txtsearch.sendKeys("iphone");
		
		WebElement btnsearch = driver.findElement(By.xpath("//a[text()='Search']"));
		btnsearch.click();

		WebElement btnclick = driver.findElement(By.xpath("(//img[@title='Apple Iphone 6 64 Gb Refurbished Mobile Phone'])[1]"));
		btnclick.click();

		driver.quit();
	}

}
