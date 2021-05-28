package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_09 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		//driver.manage().window().maximize();
		WebElement txtusr = driver.findElement(By.id("username"));
		txtusr.sendKeys("9384873332");
		
		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys("9384873332",Keys.ENTER);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select sr = new Select(roomtype);
		
		List<WebElement> rtypes = sr.getOptions();
		
		for (WebElement webElement : rtypes) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		
	}

}
