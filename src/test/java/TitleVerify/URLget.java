package TitleVerify;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLget {
	
	
	@Test
	public void urlTest() {
	
		/*
		 * get
		 * navigate.to
		 * navigate.back
		 * navigate.forward
		 * naviate.refresh
		 * 
		 * getTitle
		 * getCurrentUrl
		 * 
		 * sendKeys
		 * click
		 * 
		 * close
		 * quit
		 * 
		 * findElements
		 */
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			String actual = driver.getCurrentUrl();
			
			String expected = "https://www.google.com/";
			
			assertEquals(expected,actual);
			
			driver.close();
			
		
		
	}

}
