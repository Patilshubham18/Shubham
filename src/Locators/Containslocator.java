package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containslocator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			 
			driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
			
			driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
			
			String Expt="actiTIME - Login";
			String actual=driver.getTitle();
			System.out.println(actual);
			
			if(Expt.equals(actual)) {
				System.out.println("test pass");
				}
			else {
				System.out.println("fail");
			}
	}

}
