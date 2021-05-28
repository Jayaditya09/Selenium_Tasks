package selenium.tasks.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_No_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();

		WebElement src1 = driver.findElement(By.xpath("(//a[text()=' BANK '])"));

		WebElement tar1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));

		WebElement tar2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement src3 = driver.findElement(By.xpath("(//a[text()=' SALES '])"));
		
		WebElement tar3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement tar4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(src1, tar1).perform();

		ac.dragAndDrop(src2, tar2).perform();
		
		ac.dragAndDrop(src3, tar3).perform();
		
		ac.dragAndDrop(src2, tar4).perform();




	}

}
