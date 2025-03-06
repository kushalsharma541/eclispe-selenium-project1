package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class FirstTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		driver.quit();
	}
	
}
