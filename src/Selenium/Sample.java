package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize browser
		driver.manage().window().maximize();
		//switch to 1st iframe
		driver.switchTo().frame("packagelistframe");
		
		//now jump from 1st iframe to 2nd frame
		   String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		
		System.out.println("t1");
		
		//packages switch from 1st frame to main webpage
		
		driver.switchTo().defaultContent();
		//now jump from main webpage to 2nd frame
		
		driver.switchTo().frame("packageframe");
		//take any element and print it
		String t2 = driver.findElement(By.xpath("//a[text()='Actions']")).getText();
		
		System.out.println("t2");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classframe");
		
		String t3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println("t3");
		
		
		
		
		

		
}
}
