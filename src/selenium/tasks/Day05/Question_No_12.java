package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();
		
		Actions ac =new Actions(driver);
		Thread.sleep(300);
		WebElement mov1= driver.findElement(By.xpath("//a[text()='All Departments']"));

		ac.moveToElement(mov1).perform();
		Thread.sleep(300);
		WebElement mov2= driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		ac.moveToElement(mov2).perform();
		Thread.sleep(300);
		WebElement mov3= driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		ac.moveToElement(mov3).perform();
		Thread.sleep(300);
		WebElement btnc = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		btnc.click();
		
	}

}
