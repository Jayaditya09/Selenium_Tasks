package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtusr = driver.findElement(By.id("username"));
		txtusr.sendKeys("hello");

		String usrname = txtusr.getAttribute("value");
		System.out.println(usrname);

		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys("qwertyui");

		String password = txtpwd.getAttribute("value");
		System.out.println(password);

		driver.quit();
	}

}
