package selenium.tasks.Day12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadInter {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolltarget = driver.findElement(By.xpath("//div[@class='feature-row']//span[contains(text(),'Certification')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolltarget);
		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));
		findElement.click();
		Robot rb = new Robot();
		//Actions ac= new Actions(driver);
		List<WebElement> listofele = driver.findElements(By.xpath("//a[@title='Interview Questions']"));
		//			for (WebElement webElement : listofele) {
		for(int i=0;i<=15;i++)
		{
			WebElement webElement = listofele.get(i);
			Thread.sleep(500);
			webElement.click();
			String parentwin = driver.getWindowHandle();
			Set<String> childwin = driver.getWindowHandles();
			for (String webElement2 : childwin) {
				if(!webElement2.equals(parentwin))
				{
					driver.switchTo().window(webElement2);
				}
			}
			Thread.sleep(500);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_S);

			rb.keyRelease(KeyEvent.VK_S);
			rb.keyRelease(KeyEvent.VK_CONTROL);

			Thread.sleep(1000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			driver.close();
			for (String webElement2 : childwin) {
				if(!webElement2.equals(parentwin))
				{
					driver.switchTo().window(parentwin);
				}
			}
			//				ac.contextClick();
		}
		
	}

}
