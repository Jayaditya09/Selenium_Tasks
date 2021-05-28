package selenium.tasks.Day08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Question_No_03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();
		
		WebElement btn1 = driver.findElement(By.xpath("(//a[text()='Alert with Textbox '])"));
		
		btn1.click();
		
		WebElement btnclick = driver.findElement(By.xpath("(//button[text()='click the button to demonstrate the prompt box '])"));
		btnclick.click();
		
		Alert a= driver.switchTo().alert();
		a.accept();
	}

}
