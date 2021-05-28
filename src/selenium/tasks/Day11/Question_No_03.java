package selenium.tasks.Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_03 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement tablecontent = driver.findElement(By.xpath("//table"));
		List<WebElement> elementslist = tablecontent.findElements(By.tagName("tr"));
		int size = elementslist.size();
		System.out.println("Rows = "+size);
		driver.quit();
	}

}
