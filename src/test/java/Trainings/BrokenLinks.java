package Trainings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		/*
		Collect all the links present on a web page based on the <a> tag.
		Send HTTP request for each link.
		Verify the HTTP response code.
		Determine if the link is valid or broken based on the HTTP response code.
		Repeat the process for all links captured with the first step. */
	}

}
