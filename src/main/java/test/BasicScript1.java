package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String Title = driver.getTitle();
		
		System.out.println("Title of the web address is " + Title);
		
		driver.quit();
		
	}

}
