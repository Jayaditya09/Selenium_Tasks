package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_06 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select cn=new Select(dropdown);
		
		List<WebElement> countryoptions = cn.getOptions();
		
		for (int i = 1; i < countryoptions.size(); i++) {
			
			WebElement listElement = countryoptions.get(i);
			
			String text = listElement.getText();
			
			System.out.println(text);
		}
	}

}
