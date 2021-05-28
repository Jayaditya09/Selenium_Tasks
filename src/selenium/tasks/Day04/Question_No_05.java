package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_05 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement txtpar = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		System.out.println(txtpar.getText());
		driver.quit();
	}

}
