package Trainings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*
1) How To Handle Browser Windows in Selenium WebDriver?
2) What is the Difference between getWindowHandle() & getWindowHandles() methods?
3) How To Switch between Multiple Browser Windows?
4) What is the difference between close() and quit() methods?
5) How to close All browser Windows?
6) How To close Specific Browser Window by choice?
		 */
		
	WebElement WindowID =	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	
	WindowID.click();
	/* 1
	String WID = driver.getWindowHandle();
	System.out.println("The title of the page :" + WID); 
	*/
	//2
	
	Set<String> WIDs =driver.getWindowHandles(); //returns multiple window id
	
	//Iterator method
	/*Iterator<String> it = WIDs.iterator();
	String parentID = it.next();
	String ChildID = it.next();
	
	System.out.println(parentID);
	System.out.println(ChildID); */
	
	//Array
	
	 List<String> WIDList =new ArrayList(WIDs); //converting Set to list
	
	String parentID = WIDList.get(0);
	String ChildID = WIDList.get(1);
	
	System.out.println(parentID);
	System.out.println(ChildID); 

	//3
	driver.switchTo().window(parentID);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(ChildID);
	System.out.println(driver.getTitle());
	
	driver.close();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.quit();

	}

}
