package selenium.tasks.Day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor script = (JavascriptExecutor) driver;
		
//		WebElement scrolltar = driver.findElement(By.xpath("//h2[contains(text(),'Selenium Test Paper')]"));
//		script.executeScript("arguments[0].scrollIntoView(true)",scrolltar);
		
		WebElement testpap = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		script.executeScript("arguments[0].scrollIntoView(true)",testpap);
		script.executeScript("arguments[0].click()",testpap);
		Thread.sleep(1000);
		WebElement day10 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		day10.click();
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		btn.click();
		
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
		int indexOfStarting = text.indexOf("QUESTION 1");
		int indexOfEnding = text.indexOf("QUESTION 2");
		String substring = text.substring(indexOfStarting, indexOfEnding);
		System.out.println(substring);
		
		
	}

}
