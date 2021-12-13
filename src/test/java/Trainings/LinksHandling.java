package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		/*
How To Locate links in Selenium WebDriver?
What is the difference between LinkText() and PartialLinkText()?
How to capture all the links from Web Page?
What is Broken Link? How to check it?
		 */
		//How To Locate links in Selenium WebDriver?
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		//What is the difference between LinkText() and PartialLinkText()?
		//driver.findElement(By.partialLinkText("Best")).click();
		
		//How to capture all the links from Web Page?
		
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		System.out.println("The total links present in the page :" +Links.size());		
		
		//Normal loop
		
		/*for(int i=0;i<Links.size();i++)
		{
		
			System.out.println(" The text is : " + Links.get(i).getText());
			System.out.println("The attribute is :" + Links.get(i).getAttribute("href"));
		} */
		
		//
		
		/*for(WebElement ele:Links)
		{
			System.out.println( ele.getText());
			System.out.println(ele.getAttribute("href"));
		} */
		
		
		}
		}
		
		
	

