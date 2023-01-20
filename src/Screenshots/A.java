package Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 TakesScreenshot A = (TakesScreenshot)driver;
		 
		 //take the screenshot using getscreenshot method
		 
		File src = A.getScreenshotAs(OutputType.FILE);
		
		//create of file class
		
		File dest=new File("C:\\Users\\shubham\\Desktop\\abc\\google.cng");
		
	//we need to convert sc from src to destination
		Files.copy(src, dest);
		
		
		
	}
}
