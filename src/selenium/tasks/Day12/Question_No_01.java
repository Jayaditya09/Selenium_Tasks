package selenium.tasks.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolltarget = driver.findElement(By.xpath("//span[text()='Greens Technologies Navalur']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolltarget);
		WebElement porur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		String text2 = porur.getText();
		System.out.println(text2);
		driver.quit();
	}

}
