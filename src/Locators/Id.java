package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		
	}

}
