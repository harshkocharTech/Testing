package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Phygital {

    public static void completed(String[] arr) throws Exception {
        //WebDriverManager.chromedriver().setup();
    
        
        WebDriverManager.firefoxdriver().setup();
        

       // WebDriver driver = new ChromeDriver();
        
        WebDriver driver = new FirefoxDriver();
        
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://uatphygital.maxicus.com/samsung-crm/public/login");
     

        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input")).sendKeys("ashu@maxicus.com");
    

        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("123456");
        

        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/div[2]/button")).click();
        Thread.sleep(1000);

        for (int i = 0; i < arr.length; i++) {

            driver.findElement(By.xpath("//*[@id=\"example1_filter\"]/label/input")).sendKeys(arr[i]);
            Thread.sleep(3000);

            driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr/td[11]/a")).click();

            Thread.sleep(2000);

            if (driver.findElements(By.xpath("//*[@id=\"demo-status-form\"]/div[1]/span")).size() != 0) {

                WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"demo-status-form\"]/div[1]/span"));

                Thread.sleep(1000);
                dropdown.click();

            } else {
                WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"select2-demo_status-3d-container\"]"));
                Thread.sleep(1000);
                dropdown.click();
            }

            driver.findElement(By.className("select2-search__field")).sendKeys("Completed", Keys.ENTER);

            //        driver.findElement(By.className("select2-search__field")).sendKeys();

            Thread.sleep(1000);

            driver.findElement(By.name("submit")).click();

            driver.findElement(By.xpath("//*[@id=\"37\"]/a")).click();
            Thread.sleep(2000);

        }

    }

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String arr[] = {
            "41065",
            "41070",
            "41051"
        };

        completed(arr);

    }

}