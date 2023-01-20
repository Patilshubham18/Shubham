package PATIL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shubham {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://id.getharvest.com/harvest/sign_in");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    driver.close();
	    driver.get("https://id.getharvest.com/harvest/sign_in");
	   
	    
	    
		
		
		
	}

}
