package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();

		WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));

		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));

		to.sendKeys("Vijaywada");
		
		
		WebElement btnsub = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnsub.click();
	}

}
