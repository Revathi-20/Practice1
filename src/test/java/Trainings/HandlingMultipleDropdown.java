package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleDropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806177%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806177&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA15yNBhDTARIsAGnwe0VltLUCF2zspKzIx6epHo3HEa8Tp2WJlzE7jDvU6P7a-kpuYg1rThUaAiBxEALw_wcB");
		
		//Approach 1 - with Select class
		
		Select Dropdown1 = new Select(driver.findElement(By.name("birthday_day")));
		Dropdown1.selectByVisibleText("20");
		
		Select Dropdown2 = new Select(driver.findElement(By.name("birthday_month")));
		Dropdown2.selectByVisibleText("Mar");
		
		Select Dropdown3 = new Select(driver.findElement(By.name("birthday_year")));
		Dropdown3.selectByVisibleText("1996"); 
		
		//Approach 2 - Using WebElement
		
		/*//WebElement dd1 =  driver.findElement(By.name("birthday_day"));
		SelectOptions(dd1,"20");
		WebElement dd2 =  driver.findElement(By.name("birthday_month"));
		SelectOptions(dd2,"Mar");
		WebElement dd3 =  driver.findElement(By.name("birthday_year"));
		SelectOptions(dd3,"1996");
		
		public static void SelectOptions (WebElement ele, String Value)
		{
		
		Select dropd = new Select (ele);
		List <WebELement> AllOption = dropd.getOptions();
		for (WebElement option:AllOption)
		{
			if (option.getText().equals(ele));
			{
				option.click();
				break;	//*/
			}
			
		
		
		
	}

