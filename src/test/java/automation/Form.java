package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 // WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.chromedriver().setup();    

	        WebDriver driver = new ChromeDriver();
	        
	       // WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
     	  JavascriptExecutor js = (JavascriptExecutor)driver;	
     	    
		
//		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//		
//		
//		driver.findElement(By.name("firstname")).sendKeys("John");
//		
////		Thread.sleep(2000);
//		driver.findElement(By.name("lastname")).sendKeys("Doe");
//
//		driver.findElement(By.id("sex-0")).click();
//		
//		driver.findElement(By.id("exp-3")).click();
//
//		driver.findElement(By.id("datepicker")).sendKeys("23-06-2022");
//		
//		Thread.sleep(2000);
//		driver.findElement(By.id("profession-1")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.id("tool-2")).click();
//		
//		Thread.sleep(2000);
//	WebElement dropdown = driver.findElement(By.id("continents"));
//	dropdown.click();
//	 dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
//			
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.className("input-file")).sendKeys("/home/user-2006/Pictures/demo.png");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[28]/div[2]/div/a")).click();
//		
//		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElement(By.id("submit")).click();
//		
//     driver.get("https://reactjs.org/");
//        
//     String text = driver.findElement(By.className("css-1s44ra")).getText();
//     
//     Thread.sleep(2000);
//     
//     Actions act = new Actions(driver);
//     
//     WebElement btn = driver.findElement(By.className("css-1053yfl"));     
//     
//     act.moveToElement(btn).build().perform();
//     
//     
//     
//		js.executeScript("console.log(arguments[0])", text);
//	
     	  
     	 driver.get("https://www.browserstack.com/guide/select-class-in-selenium");
         
        
         Thread.sleep(2000);
         
         Actions act = new Actions(driver);
         
         WebElement btn =  driver.findElement(By.id("developers-menu-toggle"));
         Thread.sleep(1000);
         
         
//         act.moveToElement(btn).build().perform();
         
         Thread.sleep(1000);
                 
//        Select select = new Select(driver.findElement(By.id("developers-menu-dropdown")));
//        Thread.sleep(1000);
//        
//        select.selectByValue("Status");
         
         
       WebElement drop = driver.findElement(By.xpath("//*[@id=\"developers-menu-dropdown\"]/li[5]/a"));
       

       System.out.println("entered");
       
     
       System.out.println(drop.toString());
       

       System.out.println("exit");
       
     
         
       //*[@id="developers-menu-dropdown"]/li[5]/a
         
         act.moveToElement(drop).build().perform();
         
         Thread.sleep(10000);
         
         drop.click();
         
         
         
         
         
        
        
         
         
      
    	
		
		
		
		
		
		

	}

}
