package selenium.tasks.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_01 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		WebElement txtfrom = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		System.out.println(txtfrom.getText());
		
		driver.quit();
	}


}
