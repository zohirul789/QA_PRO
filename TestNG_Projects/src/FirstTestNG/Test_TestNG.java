package FirstTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TestNG {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\zohir\\geckodriver-Firefox\\geckodriver.exe";
    public WebDriver driver ;
	
  @Test
  public void f() {
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\zohir\\geckodriver-Firefox\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
