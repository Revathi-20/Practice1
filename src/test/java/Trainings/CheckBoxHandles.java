package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandles {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	
	/* 1.Select Specific text box //input[@id ='monday']

	2.Select all check boxes using for loop and for each loop //input[@type ='checkbox' and contains(@id, 'day')]

	3.Select multiple check boxes mon and sun

	4. Select last 3 check boxes

	5. Select 1st 2 check boxes */
	
	
	//1st 
	
	//driver.findElement(By.xpath("//input[@id ='monday']")).click();
	
	//2nd
	
	List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type ='checkbox' and contains(@id,'day')]"));
	
	System.out.println("Total  number of check boxes :" + Checkbox.size());
	
	/*for(int i=0;i<Checkbox.size(); i++)
	{
		Checkbox.get(i).click();
		
	}*/
	
	//-----For.. eachloop
	/*for(WebElement CB:Checkbox)
	{
		
		CB.click();
		
	} */
	
	//3rd multiple
	

	
	/* for (WebElement CB:Checkbox)
	{
		
		String s = CB.getAttribute("id");
	
		if ( s.equals("monday") || s.equals("sunday"))
		
		{
			CB.click();
		}
		} */
	
	//4th Select last 3 check boxes = size-3  Total number of checkboxes- n0 of cb to select= starting number of index
	/*int totnumofcheckboxes = Checkbox.size();
	for (int i=totnumofcheckboxes-2; i<totnumofcheckboxes; i++)
	{
		Checkbox.get(i).click();
	} */
	
	//5th select 1st 2 check box
	int totnumofcheckboxes = Checkbox.size();
	for(int i=0; i<totnumofcheckboxes; i++)
	
	{
		if(i<2) {
		Checkbox.get(i).click();
		}
	}
	}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	


