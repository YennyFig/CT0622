package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		String exePath = "./driver/chromedriver.exe"; // declaracion de variable string del chrome
		System.setProperty("webdriver.chrome.driver", exePath); // de donde lo toma el chrome driver
		WebDriver driver = new ChromeDriver(); // obejtto driver 
		driver.get("https://www.google.com"); // nos lleva  a la ruta
		driver.manage().window().maximize();
	
	}

}
