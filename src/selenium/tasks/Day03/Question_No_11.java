package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n");
	driver.manage().window().maximize();
	WebElement txtfristname = driver.findElement(By.xpath("//input[@id='firstName']"));
	txtfristname.sendKeys("kiram");
	WebElement txtlastname = driver.findElement(By.xpath("//input[@id='lastName']"));
	txtlastname.sendKeys("kiram");
	WebElement txtusrname = driver.findElement(By.xpath("//input[@id='username']"));
	txtusrname.sendKeys("kirrrram");
	WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	pwd.sendKeys("punksai@s9");
	WebElement pwd2 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	pwd2.sendKeys("punksai@s9");
	WebElement btnnext = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
	btnnext.click();
}

}
