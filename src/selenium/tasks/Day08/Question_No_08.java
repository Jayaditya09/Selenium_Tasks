package selenium.tasks.Day08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		driver.manage().window().maximize();

		//driver.switchTo().frame("Revamp_Banner_ID");

		WebElement txtusr = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtusr.sendKeys("123456");
		
		WebElement btn2 = driver.findElement(By.id("user-id-goahead"));
		btn2.click();
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@title='Password']"));
		txtpwd.sendKeys("123456");
		
		
		WebElement btn1 = driver.findElement(By.xpath("(//input[@title='Log In'])[1]"));

		btn1.click();


		Alert a= driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
	}

}
