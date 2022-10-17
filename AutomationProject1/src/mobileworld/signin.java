
package mobileworld;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    @Test
public class signin {
    public void F()



 {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        driver.findElement(By.id("username")).sendKeys("Athul");
        
        driver.findElement(By.id("password")).sendKeys("athul@1999");
        driver.findElement(By.cssSelector("a[class*='btn btn-primary btn-block']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





}
