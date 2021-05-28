package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnint = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btnint.click();
//		WebElement btnint = driver.findElement(By.xpath("//div[@class='interview-question']"));
//		btnint.click();
		
//		WebElement btncts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
//		btncts.click();
//		
		Thread.sleep(500);
		WebElement btn = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		btn.click();
		
		//driver.quit();
		
	}

}
