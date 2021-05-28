package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		WebElement btnsginup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsginup.click();
		
		WebElement txtnum = driver.findElement(By.xpath("//input[@type='tel']"));
		txtnum.sendKeys("8008316863");
		
		WebElement txtname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtname.sendKeys("Aditya");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("b.jayaditya@gmail.com");
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtpwd.sendKeys("Confedential");
		
		WebElement btnsubmit = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnsubmit.click();
		
		driver.quit();
	}

}
