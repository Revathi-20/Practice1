package Trainings;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropddown {

	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		
		//Bootstrap
		//Dropdown present inside the button tag
		//Findelement button, findelements li using for pass the correct values to select.
	
		
		//Map<String, Object> prefs = new HashMap<String, Object>();
        
	    // 1 for allowing, 2 for disabling popup
	    //prefs.put("profile.default_content_setting_values.notifications", 1);
	 
	    ChromeOptions options = new ChromeOptions();
	 
	    options.addArguments("--disable-notifications");
	    
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		
	    
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[normalize-space()='Select Product Type']")).click();
		
		Select Option = new Select(WebElement);
		
		Option.selectByVisibleText("Accounts");
		//List<WebElement> BootS = driver.findElements(By.xpath("//a[normalize-space()='Select Product Type']//li[@value='3']"));
		
		////a[normalize-space()='Select Product Type'] //li[@value='3']
		
		/* System.out.println("No of elements are :" +BootS.size());
		
		for (WebElement Elem:BootS)
		{
			if (Elem.getText().equals("Accounts"))
{
			Elem.click(); 
			
}
		} */
	}

}
