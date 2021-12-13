package Trainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		int row =driver.findElements(By.xpath("/table[@class='tsc_table_s13']//tr")).size();
		
		System.out.println("data :" +row);
		
		//for(int i=0;i=table.size();i++)
	//	{
	//		if(table.equals(table))
		
	//	}

	}
	/*
	 * Dynamic webtable willl keeps changing
	 *if Pagination is present in that case
	 *we inspect the total page num by get text and extract the number by Indexof and substring method  insideInteger.ValueOf and store it in a variable
	 *
	 *using loop by mapping right xpath span=active age get size--> page num will get fetched
	 *click and then inspect tr(rows) get the values and click next
	 *for column create an another for loop
	 *store columns in a variable by parameterizing the xpath "+tr or td+
	 *it will fetch all the values */

}
