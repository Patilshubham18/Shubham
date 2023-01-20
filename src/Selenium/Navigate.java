package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.getharvest.com/"); 
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com/");
		//to backward
		driver.navigate().back();
		//to forward
		driver.navigate().forward();
		//to refresh
		driver.navigate().refresh();
		//to close
		driver.close();
		
		
		
		
		
	}

}
