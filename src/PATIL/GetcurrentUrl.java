package PATIL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getharvest.com/");
		String link=driver.getCurrentUrl();
		System.out.println("link");
		
	}

}
