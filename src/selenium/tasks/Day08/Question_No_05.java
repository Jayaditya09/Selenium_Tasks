package selenium.tasks.Day08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		driver.manage().window().maximize();
		
		WebElement btn1 = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		
		btn1.click();
		
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
