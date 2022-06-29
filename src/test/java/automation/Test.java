package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;





import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	 // WebDriverManager.firefoxdriver().setup();
          
    	WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           
          // WebDriver driver = new FirefoxDriver();
	
        driver.manage().window().maximize();
 
       
        driver.navigate().to("https://www.flipkart.com/");

        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7814091736");



        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("harsh123@");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();



        driver.findElement(By.className("_3704LK")).sendKeys("Iphone 13");

        driver.findElement(By.className("_3704LK")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.findElement(By.className("_1fQZEK")).click();

        

        ArrayList < String > tabs2 = new ArrayList < String > (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

        
        Thread.sleep(5000);
        
        System.out.println("Added to cart");
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        Thread.sleep(5000);
        driver.findElement(By.className("_3704LK")).clear();
        driver.findElement(By.className("_3704LK")).sendKeys("Airpods");
        Thread.sleep(5000);
        driver.findElement(By.className("_3704LK")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.findElement(By.className("_2rpwqI")).click();
        Thread.sleep(5000);

        ArrayList < String > tabs3 = new ArrayList < String > (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));

        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        Thread.sleep(5000);

        driver.findElement(By.className("_3SkBxJ")).click();



        Thread.sleep(5000);

        
        

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div/div[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div/div[2]")).click();
        Thread.sleep(4000);
        
        
        driver.navigate().back();
  

    }

}