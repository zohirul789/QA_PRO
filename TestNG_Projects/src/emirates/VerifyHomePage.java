package emirates;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class VerifyHomePage {
	
	 public String baseUrl = "https://www.emirates.com/us/english/";
	 String driverpath = "C:\\Users\\zohir\\geckodriver-Firefox\\geckodriver.exe";
	 public WebDriver driver;

	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
		 
		 System.out.println("Lunch Firefox rowser");
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\zohir\\geckodriver-Firefox\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(3000);

  }
 
	  @Test
	  public void f() throws InterruptedException {
		  driver.get(baseUrl);
		  String expectedTitle = "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience";
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
		  Thread.sleep(3000);
		  
  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
  }

}
