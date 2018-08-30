package HHFirsrtMavenPrx.WebtablesDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table3Demo {
	

	static WebDriver driver;
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
	driver.get("https://forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
}

	@Test
	public void applicantsData() {
		
		printTableData("reportTab");
		
		
		
		
	}
	
	
	//method for print table data 
	public static void printTableData(String id) {
		
		int rowsCount = driver.findElements(By.xpath("//table[@id='"+id+"']/tbody/tr")).size();
		int colsCount = driver.findElements(By.xpath("//table[@id='"+id+"']/thead/tr/th")).size();
		System.out.println("-----------------------------");
		
		for(int rowNum=1; rowNum<= rowsCount; rowNum++) {
			for(int col=1;col<=colsCount; col++) {
				String xpath="//table[@id='"+id+"']/tbody/tr["+rowNum+"]/td["+col+"]";
				String tdData= driver.findElement(By.xpath(xpath)).getText();
				System.out.println(tdData+"---");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
