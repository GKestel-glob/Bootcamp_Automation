import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class MyFirstTest {

  private WebDriver driver;	
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");  
  }
	
  @Test
  public void openGlobantWebTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.globant.com/");
  }

  @AfterClass
  public void afterClass() {
	  new WebDriverWait(driver, Duration.ofSeconds(5));
	  driver.quit();
  }

}
