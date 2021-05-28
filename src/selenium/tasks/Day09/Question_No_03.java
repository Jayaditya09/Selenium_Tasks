package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnlogin.click();
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		
		Select sm=new Select(year);
		
		List<WebElement> yearoptions = sm.getOptions();
		
		for (int i = 0; i < yearoptions.size(); i++) {
			
			WebElement listElement = yearoptions.get(i);
			
			String text = listElement.getAttribute("value");
			
			System.out.println(text);
		}

	}

}
