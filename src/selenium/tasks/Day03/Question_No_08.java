package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_08 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnmodel = driver.findElement(By.xpath("//div[@id='heading201']"));
		btnmodel.click();
		Thread.sleep(500);
		WebElement btnrm1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		btnrm1.click();
		
		//driver.quit();

	}

}
