package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementVSWebElements {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebElement returns single element -- NoSuchElementException
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rev");
		System.out.println("The number of element is " +driver.getTitle());
		
		
		/*WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("The number of element is " +ele.getText()); */
		
		
		//WebElements returns multiple webElements -- No exception -- returns 0
		 
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("The number of element is " +eles.size());
		driver.quit(); 
		
		for(WebElement el:eles)
		{
			System.out.println(el.getText());
		}
		/*WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("The number of element is " +ele.getText()); */
		
		

	}

}
