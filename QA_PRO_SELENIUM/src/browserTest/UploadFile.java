package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefoxdriver.driver", "C:\\Program Files\\geckodriver.exe\\");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement upload =driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\zohir\\Pictures\\Saved Pictures\\shohid_minar (1).jpg");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		if(upload.isDisplayed()){
			System.out.println("sucessfull");
		}else{
			
			System.out.println("unsucessfull");
		}
			
			
			
			driver.close();
			System.out.println("Browser closed Sucessfully");

	}

}
