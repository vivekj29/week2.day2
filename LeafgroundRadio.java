package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		//1.Yes or No
		driver.findElement(By.id("yes")).click();
		
		//2.Checked or Unchecked
		WebElement opt1 = driver.findElement(By.xpath("//input[@name='news']"));
		boolean check1 = opt1.isSelected();
		if (check1 == true) {
			System.out.println("unchecked is the default selected radio button");
		}
		WebElement opt2 = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean check2 = opt2.isSelected();
		if (check2 == true) {
			System.out.println("checked is the default selected radio button");
		}
		
		//3.Check if 21-40 if it's not checked already
		WebElement opt3 = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		boolean check3 = opt3.isSelected();
		if(check3 == false) {
			opt3.click();
		}
		
	
	}

}
