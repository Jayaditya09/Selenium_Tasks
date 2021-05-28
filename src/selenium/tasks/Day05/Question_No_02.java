package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in");

		driver.manage().window().maximize();
		
		WebElement mouseover = driver.findElement(By.xpath("(//span[text()='Prime'])"));
		
		Actions ac =new Actions(driver);
		ac.moveToElement(mouseover).perform();
		Thread.sleep(300);
		
		WebElement fast = driver.findElement(By.xpath("(//img[@id='multiasins-img-link'])"));
		
		fast.click();
	}

}
