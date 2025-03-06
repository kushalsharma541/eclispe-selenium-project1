package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String Title = driver.getTitle();
		
		System.out.println("Title of the web address is " + Title);
		
		WebElement searchButton = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		searchButton.sendKeys("youtube.com");
		
		searchButton.sendKeys(Keys.ENTER);
		
//		searchButton.submit();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
