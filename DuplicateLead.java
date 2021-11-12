package week2.day2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("vivek@testmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a")).getText();
		System.out.println("The name of First Resulting lead is: " + name);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String actual = driver.getTitle();
		System.out.println(actual);
		if (actual.contains("Duplicate Lead")){
			System.out.println("The title is: " + actual);
		}
		else {
			System.out.println("The title does not match");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String name1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The name of the duplicate lead is: " + name1);
		if(name1.contains(name)){
			System.out.println("The duplicated lead name is same as captured name");
			
		}else {
			System.out.println("The duplicated lead name is not same as captured name");
		}
		
		
		
		
	}

}
