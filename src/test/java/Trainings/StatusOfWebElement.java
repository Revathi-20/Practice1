package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//IsEnablled() and isDisplayed()
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		search.sendKeys("Amazon");
		
		System.out.println(search.isDisplayed()); //True
		System.out.println(search.isEnabled()); //True
		
		//IsSelected
		
		WebElement male = driver.findElement(By.id("gender-male")); 
		System.out.println(male.isSelected());//False
		WebElement maleButton =driver.findElement(By.id("gender-male"));
		maleButton.click();
		System.out.println(maleButton.isSelected()); //True
		driver.findElement(By.id("gender-male")).isSelected(); //True
		
		
	}

}
