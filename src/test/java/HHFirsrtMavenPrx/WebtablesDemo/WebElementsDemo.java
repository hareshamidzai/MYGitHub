package HHFirsrtMavenPrx.WebtablesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsDemo {
	
	WebDriver driver;
	

	
	@BeforeClass  // runs once for all tests
public void setUp() {
	System.out.println("Setting up WebDriver in BeforeClass");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
	@BeforeMethod //runs before each @Test
	public void navigateToHomePage() {
	System.out.println("Navigating to homepage in @BeforeMethod...");
		driver.get("https://www.hbloom.com/Gifts/birthday-flowers");
		
}
	@Test
	public void SlideShow() throws Exception {
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		List<String> srcs = new ArrayList<>();
		
		for(WebElement flower: images) {
			srcs.add(flower.getAttribute("src"));
		}
		for(String link : srcs) {
			driver.get(link);
			Thread.sleep(1234);
		}
		
	}
	

}
