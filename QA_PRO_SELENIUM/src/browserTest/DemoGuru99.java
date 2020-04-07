package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGuru99 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Firefox.driver", "C:\\Program Files\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.guru99.com/");
		String baseURL="http://demo.guru99.com/";
		String tagName="";
		String submit="";
		
		driver.get(baseURL);
		tagName = driver.findElement(By.xpath("//input[@name='emailid']")).getTagName();
		submit = driver.findElement(By.xpath("//input[@name='btnLogin']")).getTagName();
		System.out.println(tagName);
		System.out.println(submit);
		driver.close();
	

	}

}
