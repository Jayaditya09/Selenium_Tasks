package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtuserid = driver.findElement(By.xpath("//input[@id='email']"));
		txtuserid.sendKeys("spunksai");
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpwd.sendKeys("spunksai@09");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		//working
		//WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		//Not working
		//WebElement btnlogin = driver.findElement(By.xpath("//button[@id='u_0_d_UM']"));
		btnlogin.click();
	}

}
