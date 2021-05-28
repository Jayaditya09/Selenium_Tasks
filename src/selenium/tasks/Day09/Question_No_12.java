package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		//driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.id("fruits"));

		Select sc = new Select(fruits);

		List<WebElement> options = sc.getOptions();

		int count=1;

		for (WebElement webElement : options) {

			String attribute = webElement.getAttribute("value");
			Thread.sleep(1000);
			if (count%2==0) {
				sc.selectByValue(attribute);
				System.out.println("Selected Options: "+attribute);
			}
			count++;
		}
		List<WebElement> selectedOptions = sc.getAllSelectedOptions();
		
		options.removeAll(selectedOptions);//Removes the values present in list 2 in list 1

		for (WebElement webElement : options) {
			String att = webElement.getAttribute("value");
			System.out.println("Non Selected options :"+att);
		}
	}
}























