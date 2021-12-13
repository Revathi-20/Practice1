package Trainings;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) {
		//NavigateMethod D.B Geturl = 1 param cal be passed and To URL = 2 params can be passed
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		//driver.get("https://amazon.com");
		driver.navigate().to("https://amazon.com");
		
		driver.navigate().back(); //nopcommerce page will be launched
		System.out.println("Current URL is:"+ driver.getCurrentUrl()); //Nopcommerce
		driver.navigate().forward(); //amazon page will be launched
		System.out.println("Current URL is:"+ driver.getCurrentUrl()); //Amazon
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.quit();
	}

}
