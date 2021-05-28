package selenium.tasks.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_No_03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//First name attribute=class attribute not working
//		WebElement txtFristname = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[1]"));
//		txtFristname.sendKeys("JAYADITYA");
		
		//First name attribute=placeholder
		WebElement txtFristname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFristname.sendKeys("JAYADITYA");
		
		//LastName attribute=place holder working
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("Boyina");
		
		//Address attribute=class attribute not working
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtaddress.sendKeys("Chennai");
		
		//Email attribute=class attribute not working
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("b.jayaditya@gmail.com");
		
		//Phone attribute=class attribute not working
		WebElement numPhone = driver.findElement(By.xpath("//input[@type='tel']"));
		numPhone.sendKeys("8008316863");
		
		//Male Or female Radio Button
		WebElement btnmale = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		btnmale.click();
		
		//Cricket Check Box
		WebElement btncrick = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		btncrick.click();
		
		//Movies Check Box
		WebElement btnmovie = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		btnmovie.click();
		
		//Hockey Check Box
		
		//Languages
		//all atrributes not working
//		WebElement txtlan = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
//		txtlan.sendKeys("English");
		
//		//Skills Drop Down
//		WebElement ddskill = driver.findElement(By.xpath("//select[@id='Skills']"));
//		ddskill.sendKeys("C");
		
//		//Country Drop Down
//		WebElement ddcountry = driver.findElement(By.xpath("//select[@id='countries']"));
//		ddcountry.sendKeys("India");
		
		//Country2 Drop Down
//		WebElement ddcountry2 = driver.findElement(By.xpath("//span[@role='combobox']"));
//		ddcountry2.sendKeys("India");
		
//		//DOB Year
//		WebElement dobyear = driver.findElement(By.xpath("//select[@id='yearbox']"));
//		dobyear.sendKeys("1996");
//		
//		//DOB Month
//		WebElement dobmon = driver.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[2]"));
//		dobmon.sendKeys("April");
//		
//		//DOB day
//		WebElement dobday = driver.findElement(By.xpath("//select[@id='daybox']"));
//		dobday.sendKeys("27");
		
		//Pwd
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtpwd.sendKeys("Spunksai@09");
		
		//Confrom Pwd
		WebElement txtcnfpwd = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtcnfpwd.sendKeys("Spunksai@09");
		
		
		//Submit Button
		WebElement btnsubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnsubmit.click();
		
	}

}
