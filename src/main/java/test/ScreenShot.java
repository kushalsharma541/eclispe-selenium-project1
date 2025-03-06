package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws WebDriverException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ecommerce-playground.lambdatest.io/");
		
		TakesScreenshot TakeScreenShot = (TakesScreenshot)driver;
		
		File file = TakeScreenShot.getScreenshotAs(OutputType.FILE);
		
		try {
		    //save the screenshot taken in destination path
			FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
			// Print the title after screenshot capture
	        String title = driver.getTitle();
	        System.out.println("Captured Screenshot for: " +title);
		} catch (IOException e) {
			// Catch any unexpected errors
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
