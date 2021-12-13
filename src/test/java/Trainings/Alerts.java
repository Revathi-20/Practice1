package Trainings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("Http://google.com");
    
    //Type 1 alert accept and dismiss
    //findElements = buttton xpath . click
    driver.switchTo().alert().accept();
    driver.switchTo().alert().dismiss();
    
    
    //Type 2 pass input in alerts findele
    Alert AlertWindow = driver.switchTo().alert();
		   
    System.out.println("The alert is :" + AlertWindow.getText());
	AlertWindow.sendKeys("ok");
	AlertWindow.accept();
		
	
	//Type 3 Authentication find_ele. click
	
	driver.get("revathi:rev1212@http://google.com");
	
	//Type 4
	
	ChromeOptions Options = new ChromeOptions();
	Options.addArguments("--disable-notifications");

		
			
    
	}

}
