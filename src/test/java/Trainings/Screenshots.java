package Trainings;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//Full SCreenshot
	driver.get("Http://google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	/* TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File(".//Screenshots/Sample.png");
	FileUtils.copyFile(src, trg); */
	
	/*TakesScreenshot ts =(TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File trg =new File (".//ScreenShots/try2.png");
	FileUtils.copyFile(src, trg); */
	
	//PortionScreenshot
	WebElement Section =driver.findElement(By.id("//div[@class='A8SBwf']"));
	File src =Section.getScreenshotAs(OutputType.FILE);
	File trg=new File(".//ScreenShots/Trye2.png");
	FileUtils.copyFile(src, trg);
	
	Actions act =new Actions(driver);
	act.keyDown(Keys.TAB);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.perform();
	driver.quit();
	

	}

}
