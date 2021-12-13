package Trainings;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	
	public static void main(String[] args) {
		
		//URL Title pagesource currenturl
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/Rey/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register");
		System.out.println("Title of the page is:" +driver.getTitle());
		System.out.println("Current URL of the webpage is :" +driver.getCurrentUrl());
		System.out.println("Pages source :" +driver.getPageSource());
		//driver.quit();
	}

}
