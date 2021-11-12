package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		// 1.Go to Homepage
		driver.findElement(By.linkText("Go to Home Page")).click();

		// 2.Find landing page
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href"));

		// 3.Check if link is broken
		driver.findElement(By.linkText("Verify am I broken?")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("HTTP Status 404")) {
			System.out.println("The page is broken");
		}

		// 4.Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();

		// 5.number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("How many links are available in this page? " + links.size());
	}

}
