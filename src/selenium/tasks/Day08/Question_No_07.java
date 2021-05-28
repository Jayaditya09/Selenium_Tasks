package selenium.tasks.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement txtusr = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtusr.sendKeys("123456");

		
		WebElement btn1 = driver.findElement(By.xpath("//img[@style='margin-right:18px;']"));
		
		btn1.click();
		
		WebElement txtpwd = driver.findElement(By.name("fldPassword"));
		txtpwd.sendKeys("123456");
		
		
//		Alert a= driver.switchTo().alert();
//		a.accept();
	}

}
