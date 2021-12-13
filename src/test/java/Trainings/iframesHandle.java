package Trainings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframesHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Frames.html");
		//a[normalize-space()='Iframe with in an Iframe']
		//WebElement Outer = driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"))	;
		driver.findElement(By.name("Iframe Result")).click();
		driver.switchTo().frame(0);
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		//driver.findElement(By.xpath("input[type='text']")).sendKeys("Welcome");
	}

}
