package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("Http://google.com");
	 WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
	 ele.sendKeys("mumbai");
	 ele.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(3000);
	 ele.equals("mumbai news");
	 ele.sendKeys(Keys.ENTER);
	 
	
	}

}
