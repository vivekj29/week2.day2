package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		// 1.Go to Homepage
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();

		// 2.Broken image
		WebElement broken = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		// 3.click using keyboard or mouse
		WebElement click = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		Actions obj = new Actions(driver);
        obj.doubleClick(click).build().perform();
	}

}
