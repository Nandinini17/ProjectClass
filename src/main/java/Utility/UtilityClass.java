package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	
	private void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

	}

}
