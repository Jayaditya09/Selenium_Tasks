package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_3_mahesh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://demo.automationtesting.in/Register.html");
		// to find the locator user name
		
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtusername.sendKeys("Mahesh");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("babu");
		
		WebElement txtadress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadress.sendKeys("Paramala");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("cmbr404@gmail.com");
		
		WebElement txtphn= driver.findElement(By.xpath("//input[@type='tel']"));
		txtphn.sendKeys("8096956724");
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));
		radiobtn.click();
		
		WebElement btnCheckbox1 = driver.findElement(By.id("checkbox1"));
		btnCheckbox1.click();
		
	
		WebElement txtskills = driver.findElement(By.id("Skills"));
		txtskills.sendKeys("java");
		
		WebElement txtcountry = driver.findElement(By.xpath("//select[@id='countries']"));
		txtcountry.sendKeys("India");
		
		WebElement txtYear = driver.findElement(By.id("yearbox"));
		txtYear.sendKeys("1996");
		
		WebElement txtmonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		txtmonth.sendKeys("12");
		
		WebElement txtdate = driver.findElement(By.id("daybox"));
		txtdate.sendKeys("02");
		
		WebElement txtpassword = driver.findElement(By.id("firstpassword"));
		txtpassword.sendKeys("02");
		
		WebElement txtpassword2 = driver.findElement(By.id("firstpassword"));
		txtpassword2.sendKeys("04");
		
		WebElement btnrefresh = driver.findElement(By.id("submitbtn"));
		btnrefresh.click();

	}

}
