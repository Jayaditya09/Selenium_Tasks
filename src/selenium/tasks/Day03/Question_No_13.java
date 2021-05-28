package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement txtphnum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtphnum.sendKeys("8008316863");
		
		WebElement btnsubmit = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnsubmit.click();
		
		driver.quit();
	}

}
