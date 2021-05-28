package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		//First name attribute=placeholder
		WebElement txtFristname = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtFristname.sendKeys("JAYADITYA");

		//LastName attribute=class attribute not working
		WebElement txtlastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtlastname.sendKeys("Boyina");
		
		//Email
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		txtemail.sendKeys("b.jayaditya@gmail.com");

		Thread.sleep(400);
		
		//Radio Button Male Not Working
		WebElement btnmale = driver.findElement(By.xpath("//input[@class='custom-control-input'][@value='Male']"));
		btnmale.click();
		
		//Mobile number
		WebElement txtnum = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		txtnum.sendKeys("8008316863");
		
		//DoB
		
		//Subjects Not Working
		WebElement txtsub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		txtsub.sendKeys("Selenium");
		
		//Sports Check Box Not working
		WebElement chksport = driver.findElement(By.xpath("//input[@class='custom-control-input'][@value='1']"));
		chksport.click();

		//Reading Check Box Not working
		WebElement chkread = driver.findElement(By.xpath("//input[@class='custom-control-input'][@value='2']"));
		chkread.click();
		
		//Music Check Box Not working
		WebElement chkmusic = driver.findElement(By.xpath("//input[@class='custom-control-input'][@value='3']"));
		chkmusic.click();
		
		//Address
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		txtaddress.sendKeys("Chennai");

		//Submit Button Not Working
		WebElement btnsubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
		btnsubmit.click();
		
		driver.quit();
		
	}

}
