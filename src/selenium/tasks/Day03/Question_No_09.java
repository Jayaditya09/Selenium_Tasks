package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_09 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement btnlog = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnlog.click();
		
		//WebElement txtusr = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement txtusr = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
		txtusr.sendKeys("8008316863");
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtpwd.sendKeys("spunksai");
		
		WebElement btnsub = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnsub.click();
	}

}
