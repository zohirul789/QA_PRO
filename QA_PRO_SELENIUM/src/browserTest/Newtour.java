package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtour {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver", "C:\\Program Files\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ZOHIRUL");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("ALOM");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7189155916");
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("johir_2008@hotmail.com");
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("10609 79th st");
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("OZONE PARK");
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NY");
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11416");
	    Select dropdown = new Select(driver.findElement(By.name("country")));
	    Thread.sleep(2000);
	    dropdown.selectByIndex(215); 
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johir_2008");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("05071988");
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("05071988");
	    driver.findElement(By.xpath("//input[@name='register']")).click();
	    driver.close();
	    
	    System.out.println("Registered successfull");

	}

}
