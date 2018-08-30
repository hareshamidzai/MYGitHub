package HHFirsrtMavenPrx;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/");
		
		WebElement selectTag = driver.findElement(By.name("my_html_select_box"));
		
		Select list = new Select(selectTag);
		
	System.out.println(list.getFirstSelectedOption().getText());
	
	// returns a list of all the options 
	   List<WebElement> Options = list.getOptions();
	   
	   System.out.println("________________ ");
	   
	   for (WebElement webElement : Options) {
		   System.out.println(webElement.getText());
		    }
	   
	   System.out.println("_______________");
	   
	   list.selectByVisibleText("Bucharest");
	   
	   System.out.println("selected:\t"+list.getFirstSelectedOption().getText());
	   
	  
	   
		
		
		
	
		
		

	}

}
