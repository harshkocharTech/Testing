package automation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("New Delhi");
        Thread.sleep(1000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("London");
        Thread.sleep(2000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[11]/div[1]/div[1]/div[2]/div/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();
        Thread.sleep(2000);
        ArrayList < String > tabs = new ArrayList < String > (driver.getWindowHandles());
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div[2]/section/div/div[3]/div[1]/div/div/span[1]/span/span")).click();
        Thread.sleep(2000);
        String totalFare = driver.findElement(By.xpath("//*[@id=\"FARE_SUMMARY\"]/section/div[5]/p/span[2]")).getText();
        Thread.sleep(2000);
        String msg = "Your total fare is " + totalFare;
        js.executeScript("alert(arguments[0])", msg);
        
        
        
        
        
        
        
        
        

    }

}