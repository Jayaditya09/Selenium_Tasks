package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();
		
		
		Actions ac =new Actions(driver);

		WebElement mov1= driver.findElement(By.xpath("//a[text()='All Departments']"));

		ac.moveToElement(mov1).perform();
		
		WebElement mov2= driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		ac.moveToElement(mov2).perform();
		
		WebElement mov3= driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		ac.moveToElement(mov3).perform();
		
		WebElement btnc = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])"));
		btnc.click();
		
	}

}
