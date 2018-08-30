package HHFirsrtMavenPrx.WebtablesDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTablesExm {

	WebDriver driver;
	Faker fake = new Faker();

	
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
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=wooden+spoon");
		
			
		
}
	
	@Test
	public void getAllProductsV1() {
	List <WebElement> description =	driver.findElements(By.xpath("//div[@class ='s-item-container' ]"));
		for (WebElement item : description) {
			System.out.println(item.getText());
			
		}
	
	
		List <WebElement> prices =	driver.findElements(By.xpath("//span[@class='sx-price sx-price-large']"));	
		for (WebElement price : prices) {
			System.out.println(price.getText());
			
		}	
			
		for (int i = 0; i < description.size() && i < prices.size(); i++) {
			System.out.println(description.get(i).getText());
			System.out.println(prices.get(i).getText());
			System.out.println("--------------------------");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		System.out.println("Closing Driver Now");
		driver.close();
		
	}
	
}
