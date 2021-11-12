package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewSalesforce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Vivek");
		driver.findElement(By.name("UserLastName")).sendKeys("J");
		driver.findElement(By.name("UserEmail")).sendKeys("vivekj@testmail.com");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select jobtitle = new Select(title);
		jobtitle.selectByValue("Customer_Service_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("Wayne Enterprises");
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select eecount = new Select(employees);
		eecount.selectByValue("250");
		driver.findElement(By.name("UserPhone")).sendKeys("9840098400");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countrynm = new Select(country);
		countrynm.selectByValue("HK");
		WebElement state = driver.findElement(By.name("CompanyState"));
		Select compstate = new Select(state);
		compstate.selectByValue("Hong_Kong_Island");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		
		//driver.close();

	}

}
