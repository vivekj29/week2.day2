package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//1.Go to homepage
		driver.findElement(By.id("home")).click();
		
		//2.Get position
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//3.Get colour
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//4.Get size
		System.out.println(driver.findElement(By.id("size")).getSize());

	}

}
