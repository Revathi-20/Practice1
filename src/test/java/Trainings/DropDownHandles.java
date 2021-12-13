package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//Selecting 1 Dropdown using Select method
		
		WebElement DropDown = driver.findElement(By.id("input-country"));
		Select drpdwn = new Select(DropDown);
		//drpdwn.selectByVisibleText("Bhutan");
		//drpdwn.selectByValue("25");
		//drpdwn.selectByIndex(25);
		
		//Selecting 1 Dropdown without using methods
		
		List<WebElement> AllOptions = drpdwn.getOptions();
		for (WebElement Option : AllOptions)
		{
			if(Option.getText().equals("Bhutan"))
			
			{
			Option.click();
			break;
			}
			
	}
	}
	
	//orangehrm.com
	//Selectingmultiple dropdowns
}
