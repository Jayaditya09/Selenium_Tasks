package selenium.tasks.Day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_07 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		Thread.sleep(500);
		WebElement test = driver.findElement(By.xpath("//h2[contains(text(),'Software Download Links')]"));
		WebElement frametest = driver.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]"));
		script.executeScript("arguments[0].scrollIntoView(true)",test);
		frametest.click();
		Thread.sleep(500);
		WebElement junit = driver.findElement(By.xpath("//a[contains(text(),'Day4_ControlStatements')]"));
//		junit.click();
		script.executeScript("arguments[0].click()", junit);
		
		Thread.sleep(2000);
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		Thread.sleep(500);
		for (String string : allwin) {
			if(!parentwin.equals(string))

			{
				driver.switchTo().window(string);
			}
		}
		
		WebElement textFull = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		
		String text = textFull.getText();
//		boolean contains = text.contains("1.What");
//		System.out.println(contains);
		int indexOfStarting = text.indexOf("1.Wha");
		int indexOfEnding = text.indexOf("2.Whether");
		String substring = text.substring(indexOfStarting, indexOfEnding);
		System.out.println(substring);
		int length = substring.length();
		System.out.println(length);
		driver.quit();
	}

}
