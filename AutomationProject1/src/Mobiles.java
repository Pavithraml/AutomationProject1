import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class Mobiles {
  
	 WebDriver driver1;
	 
	 @Parameters("browser")
	 @BeforeMethod
    
         public void browserSelection(String browser) throws Exception{
             
              if(browser.equalsIgnoreCase("chrome")){
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavithra.m\\Downloads\\chromedriver_win32\\chromedriver.exe");



                 driver1 = new ChromeDriver();



            }
                     else if(browser.equalsIgnoreCase("Edge")){
                          System.setProperty("webdriver.edge.driver", "C:\\Users\\pavithra.m\\Downloads\\edgedriver_win64\\msedgedriver.exe");



                                             driver1 = new EdgeDriver();
    }
              driver1.get("https://mobileworld.banyanpro.com/");

                     }
    	 

    @Test(priority = 2)
    public void allMobiles() throws InterruptedException {
        WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        List<WebElement> names = driver1.findElements(By.xpath("//table/thead/tr"));
        for (WebElement n1 : names) {
            String abc = n1.getText();
            if (abc.contains("Mobile Name")) {
                Assert.assertTrue(true);
            }
        }
    }
    @Test(priority = 3)
    public void searchLenovo() {
    	WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        driver1.findElement(By.id("myInput")).sendKeys("Lenovo");
        String mobName = driver1.findElement(By.xpath("//tbody[@id='myTable']/tr[4]/td[1]")).getText();
        Assert.assertTrue(mobName.contains("Lenovo"));
        driver1.findElement(By.id("myInput")).clear();
        }
    @Test(priority = 4)
    public void searchSamsung() {
    	WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        driver1.findElement(By.id("myInput")).sendKeys("Samsung");
        String mobName = driver1.findElement(By.xpath("//th[text()='Mobile Name']/../../../tbody/tr/td")).getText();
        Assert.assertTrue(mobName.contains("Samsung"));
        driver1.findElement(By.id("myInput")).clear();
        }
    @Test(priority = 5)
    public void wrongApple() {
    	WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        driver1.findElement(By.id("myInput")).sendKeys("Apple iphone ");
        // We cannot assert statement here because no error message is displayed
        driver1.findElement(By.id("myInput")).clear();
        }
    //@Test(priority = 6)
    //public void wrongSamsung() {
        //driver.findElement(By.id("myInput")).sendKeys("S@msung");
        // We cannot assert statement here because no error message is displayed
        //driver.findElement(By.id("myInput")).clear();
    //}
    
    @Test(priority = 7)
    public void twoCharacter() {
    	WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        driver1.findElement(By.id("myInput")).sendKeys("Sa");
        String mobName = driver1.findElement(By.xpath("//th[text()='Mobile Name']/../../../tbody/tr/td")).getText();
        Assert.assertTrue(mobName.contains("Samsung"));
        driver1.findElement(By.id("myInput")).clear();
        }
    
    @Test(priority = 8)
    public void order() throws InterruptedException {
    	
    	WebElement allMobiles = driver1.findElement(By.xpath("//*[text()='All Mobiles']"));
        allMobiles.click();
        
    	driver1.findElement(By.id("myInput")).sendKeys("Samsung Galaxy S21");
       
        //Thread.sleep(2000);
        driver1.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
        
        // Assertion
        //String URL = driver.getCurrentUrl();
        //Assert.assertEquals(URL, "https://mobileworld.banyanpro.com/mobile.html" );
        //String URL1 = driver.findElement(By.xpath("///html/body/section[1]/h1")).getText();
        //Assert.assertTrue(URL1.contains("welcome to our mobile world"));
       
      
        	
        	
 
           
    }
    
}


