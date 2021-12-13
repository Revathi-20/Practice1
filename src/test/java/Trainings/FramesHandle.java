package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
* 1) What is the difference between frame and iframe?
2) How To Handle iframes in Selenium WebDriver?
3) How To Switch between multiple iFrames?
4) How To Work with Inner iFrames?

		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/frames/");
		
		driver.switchTo().frame("Example");
		
		driver.findElement(By.id("//a[normalize-space()='Chapter 1']")).click();
		
		driver.switchTo().defaultContent();  //To switch to main page

		

	}

}
