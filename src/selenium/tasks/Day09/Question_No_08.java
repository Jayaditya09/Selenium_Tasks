package selenium.tasks.Day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_No_08 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayaditya\\eclipse-workspace\\Selenium Tasks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		//driver.manage().window().maximize();
		WebElement txtusr = driver.findElement(By.id("username"));
		txtusr.sendKeys("9384873332");

		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys("9384873332",Keys.ENTER);

		WebElement loc = driver.findElement(By.id("location"));

		Select sloc = new Select(loc);

		sloc.selectByVisibleText("London");

		WebElement hotel = driver.findElement(By.id("hotels"));

		Select shot = new Select(hotel);

		shot.selectByVisibleText("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));

		Select sroom = new Select(room);

		sroom.selectByVisibleText("Super Deluxe");

		WebElement roomno = driver.findElement(By.id("room_nos"));

		Select snoroom = new Select(roomno);

		snoroom.selectByVisibleText("1 - One");

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("04/05/2021");

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("06/05/2021");

		WebElement noofadults = driver.findElement(By.id("adult_room"));

		Select snoadu = new Select(noofadults);

		snoadu.selectByVisibleText("1 - One");

		WebElement noofchilds = driver.findElement(By.id("child_room"));

		Select snoch = new Select(noofchilds);

		snoch.selectByVisibleText("1 - One");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement rdbtn = driver.findElement(By.id("radiobutton_0"));
		
		rdbtn.click();
		
		WebElement btncon = driver.findElement(By.id("continue"));
		btncon.click();
		
		WebElement txtfn = driver.findElement(By.id("first_name"));
		txtfn.sendKeys("Aditya");
		
		WebElement txtln = driver.findElement(By.id("last_name"));
		txtln.sendKeys("Boyina");
		
		WebElement txtbad = driver.findElement(By.id("address"));
		txtbad.sendKeys("Chennai");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234567891234567");
		
		
		
		WebElement cctype = driver.findElement(By.id("cc_type"));

		Select type = new Select(cctype);

		type.selectByVisibleText("VISA");


		WebElement ccmon = driver.findElement(By.id("cc_exp_month"));

		Select mon = new Select(ccmon);

		mon.selectByVisibleText("April");

		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));

		Select year = new Select(ccyear);

		year.selectByVisibleText("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		
		Thread.sleep(10000);
		WebElement btnbookno = driver.findElement(By.id("order_no"));
		String bookingid = btnbookno.getAttribute("value");
		
		System.out.println(bookingid);
		
		driver.close();
	}

}
