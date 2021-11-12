package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFacebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("H");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9840098400");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Facebook");
		WebElement daydd = driver.findElement(By.id("day"));
		Select day = new Select(daydd);
		day.selectByValue("1");
		WebElement monthdd = driver.findElement(By.id("month"));
		Select month = new Select(monthdd);
		month.selectByValue("12");
		WebElement yeardd = driver.findElement(By.id("year"));
		Select year = new Select(yeardd);
		year.selectByValue("2005");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
