package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBoxTextandAttributes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//TO Get text-- To fetch inner text of the element from HTML code
		/* WebElement text = driver.findElement(By.id("Email"));
		text.clear();
		text.sendKeys("rev@gmail.com");
		System.out.println(text); */
		
		//To Get Attributes--To fetches the text contained by an attribute from HTML code
		WebElement Attributes = driver.findElement(By.id("Email"));
		System.out.println("The Value is :" + Attributes.getAttribute("value"));
		System.out.println("The Value is :" + Attributes.getText());
	}

}
