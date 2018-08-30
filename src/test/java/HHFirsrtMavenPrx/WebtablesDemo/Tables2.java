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

public class Tables2 {

	WebDriver driver;
	Faker fake = new Faker();

	
	@BeforeClass  // runs once for all tests
public void setUp() {
	System.out.println("Setting up WebDriver in BeforeClass");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
	@BeforeMethod //runs before each @Test
	public void navigateToHomePage() {
	System.out.println("Navigating to homepage in @BeforeMethod...");
	driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=wooden+spoon");
}
	@Test 
	public void TestHoleItems() {
		
		List<WebElement> wholeItems =driver.findElements(By.xpath("//div[@class='s-item-container']"));
		System.out.println("WholeItems size: " + wholeItems.size());
		
	for(int i = 0; i < wholeItems.size(); i++) {
		if(wholeItems.get(i).getText().isEmpty()) continue;
		
		String desXpath = "(//div[@class='s-item-container'])[" + (i+1) +"]//h2";
		String priceXpath = "(//div[@class='s-item-container'])["+(i+1)+"]//span[@class='sx-price sx-price-large']" ;
	
	System.out.println(driver.findElement(By.xpath(desXpath)).getText());
	System.out.println(driver.findElement(By.xpath(priceXpath)).getText());
	System.out.println("------------------");
	
	
	}
	
	
	
	
	
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
}
