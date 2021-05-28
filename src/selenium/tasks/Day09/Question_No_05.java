package selenium.tasks.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnlogin.click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		
		Select sm=new Select(day);
		
		List<WebElement> dayoptions = sm.getOptions();
		
		for (int i = 1; i < dayoptions.size(); i++) {
			
			WebElement listElement = dayoptions.get(i);
			
			//String att = listElement.getAttribute("value");
			
			String att = listElement.getText();
			int y=Integer.parseInt(att);
			
			if (y%2==0) {
				
			
			System.out.println(att);
			}
		}

}
}