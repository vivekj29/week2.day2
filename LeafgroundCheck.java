package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//1.Languages
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[3]")).click();
		
		//2.Checked or Unchecked
		WebElement opt1 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
		boolean check1 = opt1.isSelected();
		if (check1 == true) {
			System.out.println("Selenium is checked");
		}
		
		//3.Deselect checked
		WebElement opt2 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		boolean check2 = opt2.isSelected();
		if(check2 == true) {
			opt2.click();
		}
		WebElement opt3 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]"));
		boolean check3 = opt3.isSelected();
		if(check3 == true) {
			opt3.click();
		}
		
		//4.Check all
		driver.findElement(By.xpath("//div[contains(text(),'Option 1')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 2')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 3')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 4')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 5')]/input")).click();		
				
	
	}

}
