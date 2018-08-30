package DiceJobSearchDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals;
public class JobSearchDice {
	
	@Test
	public void JobSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String URL = "https://dice.com";
		driver.get(URL);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Job Search for Technology Professionals | Dice.com";
		assertEquals(actualTitle,expectedTitle);
		
		driver.findElement(By.name("q")).sendKeys("java developer");
		driver.findElement(By.id("search-field-location")).clear();
		driver.findElement(By.id("search-field-location")).sendKeys("Maryland");
		
		driver.findElement(By.id("findTechJobs")).click();
		
		String count = driver.findElement(By.id("posiCountId")).getText();
		String actualCount = "1,242";
		
		int countResult = Integer.parseInt(count.replace(",", ""));
		
		if(countResult > 1000) {
			System.out.println("Count : "+countResult+ " search returned "+ count + " actualCount is "+ actualCount);
		}
		
		
		assertEquals(count,actualCount);
		
		
		System.out.println(count);
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
