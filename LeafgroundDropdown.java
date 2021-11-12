package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		// 1.Index
		WebElement select = driver.findElement(By.id("dropdown1"));
		Select training = new Select(select);
		training.selectByIndex(3);

		// 2.Text
		WebElement select1 = driver.findElement(By.name("dropdown2"));
		Select training1 = new Select(select1);
		training1.selectByVisibleText("Selenium");

		// 3.value
		WebElement select2 = driver.findElement(By.id("dropdown3"));
		Select training2 = new Select(select2);
		training2.selectByValue("2");

		// 4. number of options
		WebElement select3 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select training3 = new Select(select3);
		List<WebElement> count = training3.getOptions();
		System.out.println(count.size());
		
		// 5. sendkeys
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("UFT/QTP");
		
		// 6.Select
		WebElement select4 = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		Select training4 = new Select(select4);
		training4.selectByVisibleText("Selenium");
		training4.selectByIndex(2);
		training4.selectByValue("4");
	}

}
