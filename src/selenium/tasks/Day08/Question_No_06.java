package selenium.tasks.Day08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_06 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		driver.manage().window().maximize();
		
		WebElement btn1 = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		
		btn1.click();
		
		WebElement login = driver.findElement(By.id("Button2"));
		
		login.click();
		
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.quit();
	}

}
