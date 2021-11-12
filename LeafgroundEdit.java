package week2.day2;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//1. Enter email address
		driver.findElement(By.id("email")).sendKeys("vivek@testmail.com");
		
		//2. Append new text and press tab key
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys("newtext");
		append.sendKeys(Keys.TAB);
		
		//3. Get default text entered
		System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value"));
		
		//4. Clear the text
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		
		//5. Is disabled?
		/*boolean disabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isDisplayed();
		Assert.assertEquals(disabled,true);*/
		System.out.println(driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isDisplayed());

	}

}
