package selenium.tasks.Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_02 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement tablecontent = driver.findElement(By.xpath("//table"));
		
//		String a="//tr[", b="]", rownumber="9";
//		a=a.concat(rownumber);
//		String rownum=a.concat(b);
//		System.out.println(rownum);
		
		
		
		
		
		List<WebElement> elementslist = tablecontent.findElements(By.xpath("//tr[1]"));
		for (WebElement webElement : elementslist) {
			String text = webElement.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
