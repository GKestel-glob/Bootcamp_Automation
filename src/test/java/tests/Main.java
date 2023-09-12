package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
		
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globant.com/");	
		// Uncomment this line to automatically close the browser at the end of the test
		//driver.quit();  
	}
}
