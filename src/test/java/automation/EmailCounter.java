package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailCounter {

	public static void main(String[] args ) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.kochartech.com/"); 
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("harsh.malhotra@kochartech.com");
		
		Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("beige@5815N");
	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body > div > div.center > div.contentBox > form > table > tbody > tr:nth-child(3) > td.submitTD > input.ZLoginButton.DwtButton")).click();
	
	Thread.sleep(2000);
	
	WebElement ul = driver.findElement(By.id("zl__CLV-main__rows"));
	
	Thread.sleep(2000);
	
	List<WebElement> emails = ul.findElements(By.tagName("li"));
	Thread.sleep(1000);
	
	System.out.println("The number of emails are:  "+emails.size());
	
	int size = emails.size();
	
	 
    String msg = "The number of emails are: "+size;
	
	
	
js.executeScript("alert(msg)");

	
		
		Thread.sleep(1000);
	
		
		
		

	}

}
