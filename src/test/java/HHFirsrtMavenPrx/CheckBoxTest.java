package HHFirsrtMavenPrx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" http://the-internet.herokuapp.com/checkboxes");
		
	//	WebElement firstOne = driver.findElement(By.tagName("input"));
		
		 WebElement firstOne = driver.findElement(By.cssSelector
				 ("input[type='checkbox']"));
		
		WebElement SecOne = driver.findElement
			(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		
		
		
		System.out.println("first on selected "+firstOne.isSelected());
		System.out.println("Sec one selected "+SecOne.isSelected());
		
		firstOne.click();
		System.out.println("check after click "+firstOne.isSelected());
		
		driver.close();
		
		
		
		
		
		
	}

}
