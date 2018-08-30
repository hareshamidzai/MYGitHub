package HHFirsrtMavenPrx;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;
public class googleDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hhami\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.booking.com");
		Thread.sleep(1000);
		
//		Faker faker = new Faker();
//		String name = faker.beer().name();
		
		driver.findElement(By.name("ss")).sendKeys("Ocean City Md");
		
//		driver.findElement(By.className("\r\n" + 
//				"sb-date-field__icon-text\r\n" + 
//				"")).click();
		
	  driver.findElement(By.className("sb-searchbox__button  ")).click();
		
		
		
		
		
		
		
	}

}
