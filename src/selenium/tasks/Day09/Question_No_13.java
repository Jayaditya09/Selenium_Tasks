package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		//driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.id("fruits"));

		Select sc = new Select(fruits);
		List<WebElement> options = sc.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			sc.selectByVisibleText(text);
		}
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
