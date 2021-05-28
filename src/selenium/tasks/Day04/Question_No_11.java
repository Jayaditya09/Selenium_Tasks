package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Login']"));
		btnlogin.click();

		WebElement txtusr = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtusr.sendKeys("hello");

		String usrname = txtusr.getAttribute("value");
		System.out.println(usrname);

		WebElement txtpwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtpwd.sendKeys("qwertyui");

		String password = txtpwd.getAttribute("value");
		System.out.println(password);

		driver.quit();
		
	}

}
