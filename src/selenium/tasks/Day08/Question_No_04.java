package selenium.tasks.Day08;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		System.out.println(frames.size());
		
//		driver.switchTo().frame(0);// By Frame Number
		
//		driver.switchTo().frame("login_page"); //By Frame name
		
		WebElement framexpath = driver.findElement(By.xpath("//frame[@scrolling='yes']"));// By WebElement
		
		driver.switchTo().frame(framexpath); // By WebElement
		
		WebElement btn1 = driver.findElement(By.xpath("//img[@style='margin-right:18px;']"));
		
		btn1.click();
		
		Alert a= driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		
		driver.quit();
	}

}
