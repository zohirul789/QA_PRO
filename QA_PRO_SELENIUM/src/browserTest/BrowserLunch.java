package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunch {
	
	public static void main(String[] args) throws InterruptedException {
	    
		for(int i =0;i<5;i++){
		
	    //BrowserLunch application = new BrowserLunch();
		System.setProperty("webdriver.Firefox.driver", "C:\\Program Files\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.quit();
		//System.out.println(BrowserLunch.url+" application navigate properly");
	     
	    
	    }
   }
}
