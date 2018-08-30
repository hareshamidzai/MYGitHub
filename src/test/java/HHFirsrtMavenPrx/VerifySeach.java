package HHFirsrtMavenPrx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySeach {

	public static void main(String[] args) {
		// bonigaricia
		WebDriverManager.chromedriver().setup();
		// open driver
		WebDriver driver = new ChromeDriver();
		// go to
		driver.get("https://www.etsy.com");
		// make text
		String searchTerm = "fathers day gifts";
		// go to 
		WebElement input = driver.findElement(By.id("search-query"));
		// send keys
		
		
		input.sendKeys(searchTerm+Keys.ENTER);// page directed to results page
		// locate the element again
		input = driver.findElement(By.id("search-query"));
		
		String actual = input.getAttribute("value");
		System.out.println(actual);
		
		
		
		if(actual.equals(searchTerm)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("expected:\t"+searchTerm);
			System.out.println("found:\t"+actual);
		}
		 
		
		driver.close();

	}

}
