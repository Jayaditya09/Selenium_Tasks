package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_09 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
		WebElement mov = driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		Actions ac =new Actions(driver);
		
		ac.moveToElement(mov).perform();
		
		WebElement mov2 = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		
		ac.moveToElement(mov2).perform();
		
		WebElement btnsel = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		
		btnsel.click();
	}

}
