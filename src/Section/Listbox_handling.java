package Section;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handling {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//select day listbox
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//creat object of select class
		Select s=new Select(day);
		s.selectByValue("18");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select d=new Select(month);
		d.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select c=new Select( year);
		c.selectByValue("2022");
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
