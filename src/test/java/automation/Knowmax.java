package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Knowmax {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://kmadmin.knowmax.ai/developer/"); 
Thread.sleep(1000);
		
		driver.findElement(By.id("EmailId")).sendKeys("temp@temp.com");
Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("temp1234");
Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div[2]/div/div[3]/div/input")).click();
		
		
Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"ui-tour-modal\"]/div/div/div[4]/button[2]")).click();
Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[2]/li[4]/a")).click();
Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[2]/li[4]/ul/li[1]/a")).click();
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
