package HHFirsrtMavenPrx;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample {
	
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
			driver.get("https://forms.zohopublic.com/murodil/form/JobApplicationForm/formperma/kOqgtfkv1dMJ4Df6k4_mekBNfNLIconAHvfdIk3CJSQ");
			
	}
		
		//@Test
		public void FullNameEmptyTest() {
			//fistly assert that you are on the correct page
		assertEquals(driver.getTitle(), "SDET Job Application");	
		driver.findElement(By.xpath("//input[@elname='first']")).clear();;	
		driver.findElement(By.xpath("//input[@name='Name_Last']")).clear();
	//	driver.findElement(By.xpath("//em[.=' Next ']")).click();
		
		
		}
		
		@Test
		public void FullApplation() {
		Faker  faker = new Faker();
		String firstName = faker.name().firstName();
			driver.findElement(By.xpath("//input[@name='Name_First']")).sendKeys(firstName);	
		String lastName = faker.name().lastName();
			driver.findElement(By.xpath("//input[@name='Name_Last']")).sendKeys(lastName);;
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
				
				
		
		
	}


