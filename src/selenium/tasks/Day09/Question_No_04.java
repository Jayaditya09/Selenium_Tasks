package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnlogin.click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		
		Select sm=new Select(month);
		
		List<WebElement> monthoptions = sm.getOptions();
		
		for (int i = 0; i < monthoptions.size(); i++) {
			
			WebElement listElement = monthoptions.get(i);
			
			String text = listElement.getText();
			
			System.out.println(text);
		}
	}

}
