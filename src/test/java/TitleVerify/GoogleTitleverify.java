package TitleVerify;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTitleverify {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.google.com");
		
		String expected = "Google";
		String actual = driver.getTitle();
		
		System.out.println("expected is =:\t"+ expected);
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		driver.close();
	}
}