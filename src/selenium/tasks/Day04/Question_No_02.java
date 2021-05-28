package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_02 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement btntab = driver.findElement(By.xpath("//span[text()='Trainer']"));
	btntab.click();
	Thread.sleep(400);
	WebElement txtfrom = driver.findElement(By.xpath("//p[contains(text(),'currently')]"));
	System.out.println(txtfrom.getText());
	
	driver.quit();
	
}
}
